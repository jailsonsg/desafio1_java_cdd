import java.util.Scanner;
public class DesafioJava {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        // Variaveis
        String resposta1;
        String resposta2;
        String resposta3;
        String resposta4;
        String resposta5;
        String sim  = "s";
        int total = 0;
        // solicitacoes, armazenamento das respostas e contagem
        System.out.println("Responda as perguntas: sim - s | não - n ");
        System.out.print("Telefonou para vítima ?: ");
        resposta1 = inputs.nextLine();
        // equalsIgnoreCase compara duas strings ignorando diferenças entre maiúsculas e minúsculas.
        if (resposta1.equalsIgnoreCase("S")) {
            total = total + 1;
        }
        System.out.print("Esteve no local do crime ?: ");
        resposta2 = inputs.nextLine();
        if (resposta2.equalsIgnoreCase("S")) {
            total = total + 1;
        }
        System.out.print("Mora perto da vítima ?: ");
        resposta3 = inputs.nextLine();
        if (resposta3.equalsIgnoreCase("S")) {
            total = total + 1;
        }
        System.out.print("Devia para a vítima ?: ");
        resposta4 = inputs.nextLine();
        if (resposta4.equalsIgnoreCase("S")) {
            total = total + 1;
        }
        System.out.print("Já trabalhou com a vítima ?: ");
        resposta5 = inputs.nextLine();
        if (resposta5.equalsIgnoreCase("S")) {
            total = total + 1;
        }
        // classificacoes
        if (total == 2) {
            System.out.print("Suspeita");
        } else if (total == 3 || total == 4) {
            System.out.print("Cúmplice");
        } else if (total == 5) {
            System.out.print("Assassino");
        } else if (total == 1) {
            System.out.print("Inocente");
        }
        inputs.close();
    }
}
