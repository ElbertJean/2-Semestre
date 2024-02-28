import java.util.Scanner;

class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota da 1º prova: ");
        double prova1 = scanner.nextDouble();
        System.out.print("Nota do Exercício 1: ");
        double ex1 = scanner.nextDouble();
        System.out.print("Nota do Exercício 2: ");
        double ex2 = scanner.nextDouble();
        System.out.print("Nota da API: ");
        double notaApi = scanner.nextDouble();
        System.out.print("Nota das atividades extras: ");
        double exExtra = scanner.nextDouble();
        System.out.print("Nota da prova substituta (caso necessário): ");
        double provaSub = scanner.nextDouble();
    
        double mediaFinal = (prova1*0.6+((ex1+ex2)/2)*0.4)*0.5+(Math.max(((prova1*0.6+((ex1+ex2)/2)*0.4)-5.9),0)/((prova1*0.6+((ex1+ex2)/2)*0.4)-5.9))*(notaApi*0.5)+exExtra+(provaSub*0.2);
    
        System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);
        
        scanner.close();
    }
}
