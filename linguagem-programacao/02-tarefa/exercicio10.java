class AlunoPassou {
    public static void main(String[] args) {
        double primeiraNota = 4;
        double segundaNota = 7;
        double media = (primeiraNota + segundaNota) / 2;
        if (media >= 6) {
            System.out.println("\nAprovado com média " + media);
        } else {
            System.out.println("\nReprovado com média " + media);
        }
    }
}
