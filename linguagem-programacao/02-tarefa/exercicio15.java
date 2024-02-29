class JornadaDeTrabalho {
    public static void main(String[] args) {
        int salarioPorHora = 15;
        int horasTrabalhadas = 159;
        int salarioMensal = (salarioPorHora * horasTrabalhadas);
        int horasExtras = ((horasTrabalhadas - 160) * (salarioPorHora / 2));

        System.out.println("Horas trabalhadas no mês: " + horasTrabalhadas);
        System.out.println("Salário total: R$ " + salarioMensal);
        
        if (horasTrabalhadas > 160) {
            System.out.println("Total de horas extras: " + (horasTrabalhadas - 160));
            System.out.println("Salário adicional das horas extra: R$ " + horasExtras);
            System.out.println("Salário total com hora extra: R$ " + (salarioMensal + horasExtras));
        } else {
            System.out.println("Não houve horas extras");
        }
    }
}