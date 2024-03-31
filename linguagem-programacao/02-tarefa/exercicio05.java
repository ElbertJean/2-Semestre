class VendedoraCarro {
    public static void main(String[] args) {
        double salarioFixo = 7000.00;
        double comissao = 0.10;
        int carrosVendidos = 7;
        double valorTotalVendas = 7500;
        double comissaoTotal = valorTotalVendas * comissao;
        double salarioFinal = salarioFixo + (carrosVendidos * comissaoTotal);
        System.out.println(comissaoTotal);
        System.out.println("\nSalário final = " + salarioFinal);
    }
}