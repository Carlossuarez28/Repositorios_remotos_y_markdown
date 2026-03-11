import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner numeros = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        int suma = 0;
        int [] array = new int[5];

        System.out.println("Introduce 5 numeros: ");
        for (int i = 0; i<array.length; i++){
            array [i] = numeros.nextInt();
        }

        System.out.println("Estos son los numeros del array");
        for (int i = 0; i<array.length; i++){
            System.out.println( array [i]);
        }

        for (int i = 0; i<array.length; i++){
            suma += array[i];
        }
        System.out.println("La suma de los 5 numeros del array es: " + "" + suma);

        double media = (double) suma / array.length;
        System.out.println("La media de los numeros del array es: " + "" + media);

        int numMayor = 0;
        int numMenor = 999;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i<array.length; i++){
            if (array[i] < 0)
                negativo ++;
            else
                positivo ++;

            if (array[i] < numMenor)
                numMenor = array[i];

            if (array[i] > numMayor)
                numMayor = array[i];
        }

        System.out.println("Hay " + negativo + " numeros negativos.");
        System.out.println("Hay " + positivo + " numeros positivos.");
        System.out.println("El numero mas pequeño es: " + numMenor);
        System.out.println("El numero mas grande es: " + numMayor);



        int [] edades = new int[5];

        System.out.println("Introduce 5 edades: ");
        for (int i = 0; i<edades.length; i++){
            edades [i] = numeros.nextInt();
        }

        System.out.println("Estas son las edades introducidas:");
        for (int i = 0; i<edades.length; i++) {
            System.out.println(edades[i]);
        }

        int edadMayor = 0;
        int edadMenor = 999;
        int mayorEdad = 0;
        int menorEdad = 0;

        for (int i = 0; i<edades.length; i++) {
            if (edades[i] < edadMenor)
                edadMenor = edades[i];

            if (edades[i] > edadMayor)
                edadMayor = edades[i];
        }

        System.out.println("La menor edad es: " + edadMenor);
        System.out.println("La mayor edad es: " + edadMayor);

        for (int i = 0; i<edades.length; i++){
            if (edades[i] < 18)
                menorEdad ++;
            else
                mayorEdad ++;
        }

        System.out.println("Hay " + mayorEdad + " mayores de edad");
        System.out.println("Hay " + menorEdad + " menores de edad");

         */

        Random aleatorio = new Random();
        int[] enteros = new int[10];

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = aleatorio.nextInt(100) + 1;
        }

        System.out.println("Estos son los numeros enteros introducidos:");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }

        Arrays.sort(enteros);
        System.out.println("Array ordenado de mayor a menor:");
        for (int i = enteros.length - 1; i >= 0; i--) {
            System.out.print(enteros[i] + " ");
        }

        int countPares = 0;
        int countImpares = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];

        int indexPar = 0;
        int indexImpar = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                pares[indexPar++] = enteros[i];
            } else {
                impares[indexImpar++] = enteros[i];
            }
        }

        System.out.println("\nArray de números pares:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nArray de números impares:");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

        System.out.print("\n\nIngresa un número a buscar: ");
        int numBuscado = numeros.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == numBuscado) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encuentra en el array.");
        }

    }
}