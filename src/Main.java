import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcaoEscolhida;

        Scanner teclado = new Scanner(System.in);
        Produto produto = null;
        Loja loja = null;

        do {
            System.out.println(
                    "----Digite a opção desejada----" +
                            "\n(1) criar uma loja" + //
                            "\n(2) criar um produto" + //
                            "\n(3) sair"

            );

            opcaoEscolhida = teclado.nextInt();
            teclado.nextLine();
            switch (opcaoEscolhida) {
                case 1: {
                    System.out.println("Você escolheu criar uma loja.... vamos lá!");
                    System.out.println("Digite o nome da Loja: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite a quantidade de funcionários da Loja: ");
                    int quantidadeFuncionarios = teclado.nextInt();
                    System.out.println("Digite o salário base dos funcionários da Loja: ");
                    double salarioBaseFuncionario = teclado.nextDouble();
                    teclado.nextLine(); // Limpando o buffer
                    System.out.println("Digite o endereço da Loja: ");

// Criando um ENDEREÇO!
                    System.out.println("----Digite os dados do endereço da loja---- ");
                    System.out.println("Digite a rua: ");
                    String rua = teclado.nextLine();
                    System.out.println("Digite a cidade: ");
                    String cidade = teclado.nextLine();
                    System.out.println("Digite o estado: ");
                    String estado = teclado.nextLine();
                    System.out.println("Digite o país: ");
                    String pais = teclado.nextLine();
                    System.out.println("Digite o CEP: ");
                    String cep = teclado.nextLine();
                    System.out.println("Digite o número: ");
                    String numero = teclado.nextLine();
                    System.out.println("Digite o complemento: ");
                    String complemento = teclado.nextLine();

                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);


// Cria DATA FUNDAÇÃO
                    System.out.println("----Digite a data de fundação da loja---- ");
                    System.out.println("Digite o dia: ");
                    int dia = teclado.nextInt();
                    System.out.println("Digite o mês: ");
                    int mes = teclado.nextInt();
                    System.out.println("Digite o ano: ");
                    int ano = teclado.nextInt();

                    Data dataFundacao = new Data(dia, mes, ano);

                    System.out.println("Digite a capacidade do estoque: ");
                    int capacidadeEstoque = teclado.nextInt();


                    loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);

                    System.out.println("Loja criada com sucesso!");

                    System.out.println(loja.toString());

                    break;
                }

                case 2: {
                    System.out.println("------Digite os dados do Produto------ ");
                    System.out.println("Digite o nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite o preço: ");
                    double preco = teclado.nextDouble();

// Cria a Data de Validade
                    System.out.println("----Digite a data de validade---- ");
                    System.out.println("Digite o dia: ");
                    int dia = teclado.nextInt();
                    System.out.println("Digite o mês: ");
                    int mes = teclado.nextInt();
                    System.out.println("Digite o ano: ");
                    int ano = teclado.nextInt();

                    Data dataValidade = new Data(dia, mes, ano);

                    produto = new Produto(nome, preco, dataValidade);

                    System.out.println("Produto criado com sucesso.");
                    System.out.println(produto);

                    break;

                }

                case 3: {

                    System.out.println("Saindo...");

                    break;
                }

                default: {
                    System.out.println("Opção Inválida");
                }
            }
            if (opcaoEscolhida == 2 && produto != null) {
                Data dataAtual = new Data(20, 10, 2023);

                if (produto.estaVencido(dataAtual)) {
                    System.out.println("ESTÁ VENCIDO");
                } else {
                    System.out.println("NÃO ESTÁ VENCIDO");
                }
            }
        }

        while (opcaoEscolhida != 3);


        teclado.close();
    }
}