import java.util.Scanner;

public class Matriz {
    public static int[][] crearMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas");
        int m = sc.nextInt();
        System.out.println("Ingrese el número de columnas");
        int n = sc.nextInt();
        if (m != 0 && n != 0) {
            return new int[m][n];
        } else if (n == 0) {
            System.out.println("Las filas no pueden ser nulas");
            return crearMatriz();
        } else {
            System.out.println("Las columnas no pueden ser nulas");
            return crearMatriz();
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("ingresa el numero en la posición [" + (i + 1) + ", " + (j + 1) + "]");
                int numero = sc.nextInt();
                matriz[i][j] = numero;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Esta es la matriz con números");
        for (int[] fila : matriz) {
            System.out.print("[");
            for (Integer numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.print("]\n");
        }
    }

    public static void sumarFila(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int fila;
        System.out.println("Inserte el numero de la fila a sumar:");
        fila = sc.nextInt();
        int suma = 0;
        for (Integer n : matriz[fila - 1]) {
            suma += n;
        }
        System.out.println("la suma de la fila " + fila + " es: " + suma);
    }

    public static void sumarColumna(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int columna;
        System.out.println("Inserte el numero de la columna a sumar:");
        columna = sc.nextInt();
        int suma = 0;
        for (int[] ints : matriz) {
            suma += ints[columna - 1];
        }
        System.out.println("La suma de la columna " + columna + " es: " + suma);
    }

    public static void sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
    }

    public static void sumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int limite = Math.min(filas, columnas);
        for (int i = 0; i < limite; i++) {
            suma += matriz[i][columnas - 1 - i];
        }
        System.out.println("La suma de la diagonal inversa es: " + suma);
    }
}
