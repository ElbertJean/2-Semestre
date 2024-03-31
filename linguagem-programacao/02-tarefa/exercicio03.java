class AumentarSalario {
    public static void main (String[] ang) {
        double salario = 2000.00;
        int aumento = 15;
        double novoSalario = ((salario * aumento) / 100) + salario;

        System.out.println("Salário atual: " + salario);
        System.out.println("Porcentagem do aumento: " + aumento + "%");
        System.out.println("Novo salário é de R$ " + novoSalario);
    }
}
