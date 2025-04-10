
package aerolineamatriz;

import java.util.Scanner;


public class AerolineaMatriz {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vuelos[][] = new int[4][3];
        System.out.println("bienvenido Aerolineas ");

        //rellenar la matriz
        for (int i = 0; i < vuelos.length; i++) {
            for (int j = 0; j < vuelos[i].length; j++) {
                System.out.println("digite la cantidad de asientos del avion para el vuelo [" + i + "]" + "horario" + j);
                vuelos[i][j] = entrada.nextInt();

            }
            System.out.println("");
        }

        //Cliente
        String bandera = "";

        System.out.println("---------------------------------------------------");
        while (!bandera.equalsIgnoreCase("finish")) {
            
            
            System.out.println(" Destinos");
            System.out.println("0: Rio de Janeiro"
                    + "\n 1:Cancun"
                    + "\n 2: Madrid"
                    + "\n 3:Roma ");
            
            
            System.out.println("horario de vuelos"
                    + "\n 0: mañana"
                    + "\n 1:tarde "
                    + "\n 2:noche");
            
            
            System.out.println("Digite el numero de destino");
            int destino = entrada.nextInt();
            
            
            System.out.println("ingrese el horario de vuelo"
                    + "\n 0:mañana"
                    + "\n 1: tarde"
                    + "\n2 noche");
            int horario = entrada.nextInt();
            
            
            System.out.println("digite la cantidad de asientos que quieres llevar");
            int cantidad = entrada.nextInt();

            if (horario >= 0 && horario < 4) { //if para corregir error por desbordamiento.

                if (vuelos[destino][horario] >= cantidad) { // if para reservar y restarle la cantidad de asientos al avion
                    
                    System.out.println("su reserva fue realizada con exito");

                    vuelos[destino][horario] = vuelos[destino][horario] - cantidad;

                } else {
                    System.out.println("disculpe, no hay asientos disponibles por lo tanto no de puede completar la operacion");

                }
            } else {
                System.out.println("digite un horario existente");

            }

            System.out.println("desea seguir reservando? finish para terminar o cualquier tecla para seguir");
            bandera = entrada.next();

        }

    }

}
