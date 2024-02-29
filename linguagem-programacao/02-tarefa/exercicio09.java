class QuantidadeMacas {
    public static void main (String[] args){
        int quantidadeMacas = 11;
        double valorAcimaDe12 = quantidadeMacas * 1.00;
        double valorAbaixoDe12 = quantidadeMacas * 1.30;
        if (quantidadeMacas >= 12) {
            System.out.println("\nVocê está comprando " + quantidadeMacas + " maçãs");
            System.out.println("O valor total é de R$ " + valorAcimaDe12);
        } else {
            System.out.println("\nVocê está comprando " + quantidadeMacas + " maçãs");
            System.out.println("O valor total é de R$ " + valorAbaixoDe12);
        }
    } 
}