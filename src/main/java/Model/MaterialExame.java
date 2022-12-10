package Model;

public class MaterialExame extends GenericModel {
    private String material;
    private String obsercavao;

    public MaterialExame(Integer id, String material, String obsercavao) {
        this.material = material;
        this.obsercavao = obsercavao;
        super.setId(id);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getObsercavao() {
        return obsercavao;
    }

    public void setObsercavao(String observacao) {
        this.obsercavao = observacao;
    }

    @Override
    public String toString() {
        return "MaterialExame{" +
                "id'" + this.getId() + "\'" +
                "material='" + material + '\'' +
                ", observacao='" + obsercavao + '\'' +
                '}';
    }
}
