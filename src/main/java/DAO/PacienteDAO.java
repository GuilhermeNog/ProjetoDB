package DAO;

import Model.Paciente;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO extends ConexaoDB {
    private static final String INSERT_PACIENTE_SQL = "INSERT INTO paciente (nome, dt_nascimento) VALUES (?, ?);";
    private static final String SELECT_PACIENTE_BY_ID = "SELECT id, nome, dt_nascimento FROM paciente WHERE id = ?";
    private static final String SELECT_ALL_PACIENTE = "SELECT * FROM paciente;";
    private static final String DELETE_PACIENTE_SQL = "DELETE FROM paciente WHERE id = ?;";
    private static final String UPDATE_PACIENTE_SQL = "UPDATE paciente SET nome = ?, dt_nascimento = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM paciente;";

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

    public Paciente insertPaciente(Paciente entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_PACIENTE_SQL)) {
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setDate(2, entidade.getDt_nascimento());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public Paciente selectPaciente(int id) {
        Paciente entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_PACIENTE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                Date dt_nascimento = rs.getDate("dt_nascimento");

                entidade = new Paciente(id, nome, dt_nascimento);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Paciente> selectAllPaciente() {
        List<Paciente> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_PACIENTE)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date dt_nascimento = rs.getDate("dt_nascimento");

                entidades.add(new Paciente(id, nome, dt_nascimento));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deletePaciente(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_PACIENTE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updatePaciente(Paciente entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_PACIENTE_SQL)) {
            statement.setString(1, entidade.getNome());
            statement.setDate(2, entidade.getDt_nascimento());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
