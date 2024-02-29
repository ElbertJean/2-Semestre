class VendedoraCarro {
    public static void main(String[] args) {
        double salarioFixo = 5000.00;
        double comissao = 0.05;
        int carrosVendidos = 5;
        double valorTotalVendas = 5000;
        double comissaoTotal = valorTotalVendas * comissao;
        double salarioFinal = salarioFixo + (carrosVendidos * comissaoTotal);
        System.out.println("\nSalário final = " + salarioFinal);
    }
}