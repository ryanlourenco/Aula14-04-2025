import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SegundaParte {
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
                return "ID: " + id + " | Nome: " + nome + " | Preço: R$ " + preco;
            }
        }
    }
    }

        class GerenciadorProdutos1 {
            public static <Produto> void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Produto> produtos = new ArrayList<>();
                int proximoId = 1;

                // Aqui você pode adicionar lógica para manipular os produtos

                scanner.close(); // Certifique-se de fechar o scanner para evitar vazamento de recursos
            }
        }

