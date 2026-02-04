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

         */

        int [] edades = new int[5];

        System.out.println("Introduce 5 edades: ");
        for (int i = 0; i<edades.length; i++){
            edades [i] = numeros.nextInt();
        }

        System.out.println("Estas son las edades introducidas:");
        for (int i = 0; i<edades.length; i++) {
            System.out.println(edades[i]);
        }
    }
}