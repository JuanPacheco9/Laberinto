
package laberinto;

import java.util.Scanner;


public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        Escenarios esce = new Escenarios();
        Laberinto metodo = new Laberinto();

        Scanner lector = new Scanner(System.in);
        String rta;
        int opc = 0;
        int mod = 0;
        do {
            System.out.println("¿Desea jugar?");
            rta = lector.nextLine();
            if (rta.equals("si")) {
                opc = opc + 1;
            } else {
                opc = 0;
            }

            switch (opc) {
                case 0:
                    System.out.println("Adios!");
                    break;
                case 1:

                    metodo.Avanzar(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));

                    break;
                case 2:

                    metodo.Avanzar(esce.escenarioDos(), esce.filaasterico(esce.escenarioDos()), esce.columasterico(esce.escenarioDos()));

                    break;
                case 3:

                    metodo.Avanzar(esce.escenarioTres(), esce.filaasterico(esce.escenarioTres()), esce.columasterico(esce.escenarioTres()));

                    break;
                case 4:

                    metodo.Avanzar(esce.escenarioCuatro(), esce.filaasterico(esce.escenarioCuatro()), esce.columasterico(esce.escenarioCuatro()));

                    break;
                case 5:

                    metodo.Avanzar(esce.escenarioCinco(), esce.filaasterico(esce.escenarioCinco()), esce.columasterico(esce.escenarioCinco()));

                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc != 0);

    }
}
