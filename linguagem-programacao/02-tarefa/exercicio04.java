class CustoCarro {
    public static void main(String[] args) {
        double custoFabrica = 21000;
        double percentualDistribuidor = 0.28;
        double impostos = 0.45;

        double custoConsumidor = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);

        System.out.println("\nO custo final ao consumidor é: " + custoConsumidor);
    }
}