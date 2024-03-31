public class CorpoHumano {
    private String sexo;
    private double altura;
    private double massa;
    private String nome;

    public String andar(int passos) {
        return ("Andando " + passos + " passos");
    }

    public void falar(int falar) {
        System.out.println("Frase dita: " + falar);
    }

    public boolean ouvir(int i){
        if (i % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void sorrir() {
        System.out.println("Sorrindo");
    }

    public double comer () {
        return (1.5);
    }
}