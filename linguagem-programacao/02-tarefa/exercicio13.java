class ValorCrescente {
    public static void main(String[] args) {
        int valor1= 3;
        int valor2 = 3;
        if (valor1 > valor2) {
            System.out.println( valor2 + " " +  valor1);
        } else if (valor2 > valor1) {
            System.out.println( valor1 + " " +  valor2);
        } else if (valor2 == valor1) {
            System.out.println( valor2 + " é igual a " + valor1);
        }
    }
}
