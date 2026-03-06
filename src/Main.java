import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("******************************************");
            System.out.println("Seja bem-vindo ao Conversor de Moeda =]");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("******************************************");

            try {
                opcao = leitura.nextInt();

                if (opcao == 7) {
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                }


                String deMoeda = "";
                String paraMoeda = "";

                switch (opcao) {
                    case 1 -> { deMoeda = "USD"; paraMoeda = "ARS"; }
                    case 2 -> { deMoeda = "ARS"; paraMoeda = "USD"; }
                    case 3 -> { deMoeda = "USD"; paraMoeda = "BRL"; }
                    case 4 -> { deMoeda = "BRL"; paraMoeda = "USD"; }
                    case 5 -> { deMoeda = "USD"; paraMoeda = "COP"; }
                    case 6 -> { deMoeda = "COP"; paraMoeda = "USD"; }
                    default -> {
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                    }
                }

                System.out.println("Digite o valor que deseja converter:");
                double valor = leitura.nextDouble();

                Moeda dados = consulta.buscaMoeda(deMoeda);
                double taxa = dados.conversion_rates().get(paraMoeda);
                double resultadoFinal = valor * taxa;

                System.out.printf("O valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n",
                        valor, deMoeda, resultadoFinal, paraMoeda);

            } catch (Exception e) {
                System.out.println("Erro ao processar conversão: Valor inválido ou problema na rede.");
                leitura.nextLine();
            }
        }
    }
}