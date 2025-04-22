/** Levantamento de requisitos
 * Inicializar dados do cliente*
 * Nome do cliente
 * Tipo de conta
 * Saldo
 * Menu de operarações*
 * Consultar saldo
 * Depositar
 * Transferir
 * Sair
 * */
import java.util.Scanner;
public class Cadastro { //Criação da classe Cadastro
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarações das variáveis
        String nome = "José Joaquim";
        String tipoConta = "Corrente";
        double saldo = 20000.00;
        //Interfaces de saída
        //Concatenação com Strings
        System.out.println("+++++++++++  Dados do cliente  ++++++++++");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo do cliente: " + saldo);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        int operacao = 0; //Inicialização da variável

        while (operacao != 4) {

            System.out.println("+++++++++  Menu de Operações  +++++++++++++++++");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Sair");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Escolha uma operação:");
            operacao = sc.nextInt();

            if (operacao == 1) {
                System.out.printf("Saldo atual: %.2f\n", saldo);
            }else if (operacao == 2) {
                System.out.println("Digite o valor do deposito: ");
                saldo += sc.nextDouble();
                System.out.printf("Saldo atualizado: %.2f\n", saldo);
            }else if (operacao == 3) {
                System.out.println("Digite o valor do transferência: ");
                saldo -= sc.nextDouble();
                System.out.printf("Saldo atualizado: %.2f\n", saldo);
            }else if (operacao >= 5) {
                System.out.println("Operação inválida!. Tente novamente! ");
            }else{
                System.out.println("Operação encerrada!)");
            }
        }


    }
}