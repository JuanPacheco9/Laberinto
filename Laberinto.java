
package laberinto;

import java.util.Scanner;

public class Laberinto {

    Scanner lector = new Scanner(System.in);

    public void Avanzar(String[][] matriz, int filas, int colum) {
        String labe = "x";
        int golpes = 0;
        Escenarios x = new Escenarios();
        int []arreglo = x.posX(matriz);
        while (golpes < 5) {
            if (matriz[filas][colum] == matriz[arreglo[0]][arreglo[1]]) {
                System.out.println("HAS GANADO !!");
                
                golpes += 5;
                break;
            } else {
                imprimirMatriz(matriz);
                System.out.print("Mover -> ");
                String cara = lector.next();
                //Derecha
                if (cara.equalsIgnoreCase("d")) {
                    if (!matriz[filas][colum + 1].equals("a") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                        matriz[filas][colum + 1] = "*";
                        matriz[filas][colum] = " ";
                        colum++;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //izquierda
                if (cara.equalsIgnoreCase("a")) {
                    if (!matriz[filas][colum - 1].equals("a") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                        matriz[filas][colum - 1] = "*";
                        matriz[filas][colum] = " ";
                        colum--;
                    } else {
                        golpes++;
                     
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //arriba
                if (cara.equalsIgnoreCase("w")) {
                    if (!matriz[filas - 1][colum].equals("a") && !matriz[filas - 1][colum].equals("|") && !matriz[filas - 1][colum].equals("-")) {
                        matriz[filas - 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas--;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //abajo
                if (cara.equalsIgnoreCase("s"
                        + "")) {
                    if (!matriz[filas + 1][colum].equals("a") && !matriz[filas + 1][colum].equals("|") && !matriz[filas + 1][colum].equals("-")) {
                        matriz[filas + 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas++;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }
            }
        }
    }

    public void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    
}
