import java.util.ArrayList;
import java.util.Scanner;

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

class GerenciadorProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int proximoId = 1;

        while (true) {
            System.out.println("\n1. Cadastrar produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha

                    produtos.add(new Produto(proximoId++, nome, preco));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de produtos:");
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    break;

                case 3:
                    System.out.print("ID do produto a remover: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    boolean removido = produtos.removeIf(produto -> produto.id == id);
                    if (removido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}



