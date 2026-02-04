import java.util.Scanner;

public class Main {

    static Scanner numeros = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);

    public static void main(String[] args) {

        int [] array = new int[5];
        System.out.println("Introduce 5 numeros: ");
        for (int i = 0; i<array.length; i++){
            array [i] = numeros.nextInt();
        }

        System.out.println("Estos son los numeros del array");
        for (int i = 0; i<array.length; i++){
            System.out.println( array [i]);
        }
    }
}