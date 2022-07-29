package p2a_tarea2;

import Logica.Codigo;
import java.util.Scanner;

public class P2A_Tarea2 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Codigo ej = new Codigo();
        String palabra;
        System.out.println("Ingrese el texto o mensaje a codificar: ");
        palabra = teclado.nextLine();
        System.out.println(ej.Codificar(palabra, 3));
        System.out.println("Ingrese el codigo que desee decodificar: ");
        palabra = teclado.nextLine();
        System.out.println(ej.Decodificar(palabra, 3));
    }
}
