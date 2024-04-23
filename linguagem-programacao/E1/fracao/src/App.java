import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo! Vamos calcular frações?");
        System.out.println("****************************************");
        System.out.println("Para 1º fração, digite o numerador: ");
        int numerador1 = sc.nextInt();
        System.out.println("Para 1º fração, digite o denominador: ");
        int denominador1 = sc.nextInt();
        System.out.println("Para 2º fração, digite o numerador: ");
        int numerador2 = sc.nextInt();
        System.out.println("Para 2º fração, digite o denominador: ");
        int denominador2 = sc.nextInt();
        System.out.println("Você deseja fazer qual cálculo? \n1 - Adição, \n2 - Subtração, \n3 - Multiplicação, \n4 - Divisão ");
        int calculo = sc.nextInt();

        double resultado;
        DecimalFormat formato = new DecimalFormat("#.##");
        switch (calculo) {
            case 1:
                resultado = (double) (numerador1 * denominador2 + numerador2 * denominador1) / (denominador1 * denominador2);
                System.out.println("A resposta da adição das frações é: " + formato.format(resultado));
                break;
            case 2:
                resultado = (double) (numerador1 * denominador2 - numerador2 * denominador1) / (denominador1 * denominador2);
                System.out.println("A resposta da subtração das frações é: " + formato.format(resultado));
                break;
            case 3:
                resultado = (double) (numerador1 * numerador2) / (denominador1 * denominador2);
                System.out.println("A resposta da multiplicação das frações é: " + formato.format(resultado));
                break;
            case 4:
                resultado = (double) (numerador1 * denominador2) / (denominador1 * numerador2);
                System.out.println("A resposta da divisão das frações é: " + formato.format(resultado));
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        System.out.println("\nAte mais!");

        sc.close();
    }
}