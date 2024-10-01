//Fernanda Morales 28/09/24
//Programa que crea un arreglo de 20 números e imprime sus cuadrados y cubos

import java.util.Scanner;

public class arreglosact7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Objeto scanner para leer la entrada desde el teclado
        int[] numeros = new int[20]; //Declaración del arreglo

        //Leer los 20 números
        System.out.println("Ingresa 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();
        }

        //Mostrar los números junto con sus cuadrados y cubos
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            System.out.println(numeros[i] + "\t" + (numeros[i] * numeros[i]) + "\t\t" + (numeros[i] * numeros[i] * numeros[i]));
        }

        sc.close(); //Cerrar scanner
    }
}
