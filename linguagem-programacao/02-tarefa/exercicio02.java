class CalcularEleitores {
    public static void main (String[] args) {
        int votosTotal = 5000;
        int votosValidos = 3500;
        int votosBrancos = 1000;
        int votosNulos = 500;

        double porcentagemVotosTotal = (double) votosValidos / votosTotal * 100;
        double porcentagemVotosValidos = (double) votosBrancos / votosTotal * 100;
        double porcentagemVotosNulos = (double) votosNulos / votosTotal * 100;

        System.out.println("Porcentagem de votos totais: " + porcentagemVotosTotal + "%");
        System.out.println("Porcentagem de votos validos: " + porcentagemVotosValidos + "%");
        System.out.println("Porcentagem de votos nulos: " + porcentagemVotosNulos + "%");

    }
}
