public class App {
    public static void main(String[] args) throws Exception {
        CorpoHumano humano = new CorpoHumano();
        humano.altura = 1.75;
        System.out.println(humano.comer());
    }
}
