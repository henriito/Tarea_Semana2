package Logica;

public class Codigo {

    public static String Codificar(String palabra, int llave) {
        int codificar = 0;
        String resultado = "";
        String minus = "";

        for (int x = 0; x < palabra.length(); x++) {
            codificar = (int) palabra.charAt(x);
            codificar = codificar + llave;
            char caracter = (char) codificar;
            resultado = resultado + caracter;
        }
        minus = resultado.toLowerCase();
        return "El texto/mensaje " + palabra + " codificado (y pasado a minusculas) es: " + minus;
    }

    public static String Decodificar(String palabra, int llave) {
        int codificar = 0;
        String resultado = "";

        for (int x = 0; x < palabra.length(); x++) {
            codificar = (int) palabra.charAt(x);
            codificar = codificar - llave;
            char caracter = (char) codificar;
            resultado = resultado + caracter;
        }
        return "El codigo " + palabra + " decodificado es: " + resultado;
    }
}
