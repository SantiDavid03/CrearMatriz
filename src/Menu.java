import java.util.Scanner;

public class Menu {
    public static void mostrarMenu() {
        String menu = """
                Bienvenido al menú matricial
                1.Llenar la matriz de números
                2.Sumar una fila
                3.Sumar una columna
                4.Sumar la diagonal principal
                5.Sumar la diagonal inversa
                6.Ordenar la matriz con el método burbuja
                7.Mostrar la matriz inicial y la matriz ordenada
                8.El promedio de todos los valores de la matriz
                9.Promedio de la diagonal principal
                10.El promedio de la diagonal inversa
                11.El promedio de una fila
                12.El promedio de una columna
                13.funcionalidad propuesta
                """;
        System.out.println(menu);
    }

    public static void iniciar() {
        int[][] matriz = Matriz.crearMatriz();
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        System.out.println("Ingrese una opción");
        int opcion = sc.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    Matriz.llenarMatriz(matriz);
                    Matriz.imprimirMatriz(matriz);
                    break;
                case 2:
                    Matriz.sumarFila(matriz);
                    break;
                case 3:
                    Matriz.sumarColumna(matriz);
                    break;
                case 4:
                    Matriz.sumarDiagonalPrincipal(matriz);
                    break;
            }
            mostrarMenu();
            System.out.println("Ingrese su opción");
            opcion = sc.nextInt();
        }
        sc.close();
    }
}