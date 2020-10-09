package attsingleton;

public class Pedidos {

    private int id;
    private String nome;
    private String descricao;
    private int qtde;
    private double valor;

    public String getName() {
        return this.nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return descricao;
    }

    public void setDescription(String description) {
        this.descricao = description;
    }

    public int getQuantity() {
        return qtde;
    }

    public void setQuantity(int quantity) {
        this.qtde = quantity;
    }

    public double getValue() {
        return valor;
    }

    public String toString() {
        return "Pedidos:" +"\n" +
                "Código= " +id + "\n" +
                "Nome= " + nome + "\n"  +
                "Observações= " + descricao + "\n"  +
                "Quantidade= " + qtde + "\n" +
        "Valor= " + valor + " R$";
    }

    public void setValue(double value) {
        this.valor = value;
    }
}
