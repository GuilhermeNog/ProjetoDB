package DAO;

import Model.SolicitacaoExame;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SolicitacaoExameDAO extends ConexaoDB {
    private static final String INSERT_SOLICITACAOEXAME_SQL = "INSERT INTO solicitacao_exame (nm_prescrito, consulta_medica_id, dt_solicitacao, habilitacao_exame_id, exame_id) VALUES (?, ?, ?, ?, ?);";
    private static final String SELECT_SOLICITACAOEXAME_BY_ID = "SELECT id, nm_prescrito, consulta_medica_id, dt_solicitacao, habilitacao_exame_id, exame_id FROM solicitacao_exame WHERE id = ?";
    private static final String SELECT_ALL_SOLICITACAOEXAME = "SELECT * FROM solicitacao_exame;";
    private static final String DELETE_SOLICITACAOEXAME_SQL = "DELETE FROM solicitacao_exame WHERE id = ?;";
    private static final String UPDATE_SOLICITACAOEXAME_SQL = "UPDATE solicitacao_exame SET nm_prescrito = ?, consulta_medica_id = ?, dt_solicitacao = ?, habilitacao_exame_id = ?, exame_id = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM solicitacao_exame;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prepararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertSolicitacaoExame(SolicitacaoExame entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_SOLICITACAOEXAME_SQL)) {
            preparedStatement.setString(1, entidade.getNm_prescrito());
            preparedStatement.setInt(2, entidade.getConsulta_medica_id());
            preparedStatement.setDate(3, entidade.getDt_solicitacao());
            preparedStatement.setInt(4, entidade.getHabilitacao_exame_id());
            preparedStatement.setInt(5, entidade.getExame_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public SolicitacaoExame selectSolicitacaoExame(int id) {
        SolicitacaoExame entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_SOLICITACAOEXAME_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nm_prescrito = rs.getString("nm_prescrito");
                Integer consulta_medica_id = rs.getInt("consulta_medica_id");
                Date dt_solicitacao = rs.getDate("dt_solicitacao");
                Integer habilitacao_exame_id = rs.getInt("habilitacao_exame_id");
                Integer exame_id = rs.getInt("exame_id");

                entidade = new SolicitacaoExame(id, nm_prescrito, consulta_medica_id, dt_solicitacao, habilitacao_exame_id, exame_id);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<SolicitacaoExame> selectAllSolicitacaoExame() {
        List<SolicitacaoExame> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_SOLICITACAOEXAME)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nm_prescrito = rs.getString("nm_prescrito");
                Integer consulta_medica_id = rs.getInt("consulta_medica_id");
                Date dt_solicitacao = rs.getDate("dt_solicitacao");
                Integer habilitacao_exame_id = rs.getInt("habilitacao_exame_id");
                Integer exame_id = rs.getInt("exame_id");

                entidades.add(new SolicitacaoExame(id, nm_prescrito, consulta_medica_id, dt_solicitacao, habilitacao_exame_id, exame_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteSolicitacaoExame(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_SOLICITACAOEXAME_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateSolicitacaoExame(SolicitacaoExame entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_SOLICITACAOEXAME_SQL)) {
            statement.setString(1, entidade.getNm_prescrito());
            statement.setInt(2, entidade.getConsulta_medica_id());
            statement.setDate(3, entidade.getDt_solicitacao());
            statement.setInt(4, entidade.getHabilitacao_exame_id());
            statement.setInt(5, entidade.getExame_id());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
