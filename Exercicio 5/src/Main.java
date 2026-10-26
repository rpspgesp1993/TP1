public class Main {

    public static void main(String[] args) {

        Conversor conversor = new Conversor();

        System.out.printf("%.1f°C = %.1f°F%n",
                conversor.converter(30.0),
                conversor.converter(30.0));

        System.out.printf("%.1f km = %.2f milhas%n",
                100.0, conversor.converter(100.0, true));

        System.out.println(conversor.converter("texto convertido a maiusculas"));
    }
}