import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int opcao;

        System.out.println("===== Calculadora Java =====");
        System.out.println("Digite um número: ");
        int x = leitor.nextInt();
        System.out.println("Digite outro número: ");
        int y = leitor.nextInt();
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Módulo");
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A soma dos números é igual a: " + (x + y));
                break;
            case 2:
                System.out.println("A subtração dos números é igual a: " + (x - y));
                break;
            case 3:
                System.out.println("A multiplicação dos números é igual a: " + (x * y));
                break;
            case 4:
                System.out.println("A divisão dos números é igual a: " + (x / y));
                break;
            case 5:
                System.out.println("O módulo dos números é igual a: " + (x % y));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
