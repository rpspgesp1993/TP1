public class Conversor {

    // Versão 1: Celsius -> Fahrenheit
    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Versão 2: Quilômetros -> Milhas
    public double converter(double quilometros, boolean paraMilhas) {
        return quilometros * 0.621371;
    }

    // Versão 3: String -> Maiúsculas
    public String converter(String texto) {
        return texto.toUpperCase();
    }
}