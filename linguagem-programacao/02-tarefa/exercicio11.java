class PodeVotar {
    public static void main(String[] args) {
        int anoAtual = 2024;
        int anoNascimento = 1996;
        int idade = anoAtual - anoNascimento;
        if (idade >= 18) {
            System.out.println("\nVocê tem " + idade + " anos. Você pode votar");
        } else {
            System.out.println("\nVocê tem " + idade + " anos. Você NÃO pode votar"); 
        }
    }
}
