//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrimeiraParte {
    public static void main(String[] args) {
class Produto {
    int id;
    String nome;
    double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "ID: " + id + " | Nome:: " + nome + " | Preço: R$ " + preco;
    }
}
    }
}