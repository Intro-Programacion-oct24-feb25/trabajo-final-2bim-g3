/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Scanner;
import paquete01.problemaFutbol;
import paquete02.problemaNatacion;
import paquete03.problemaAtletismo;
import paquete04.problemaBasquetball;
import paquete05.problemaCiclismo;
import paquete06.problemaTenis;
import paquete07.problemaYoga;
/**
 *
 * @author utpl
 */

public class problema {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] contador = new int[7];
        String mensaje;
        String cadena;
        boolean bandera = true;
        String salida;
        int opcion;

        while (bandera) {
            System.out.println("Ingrese la disciplina a la que desea registrarse "
                    + "futbol(1), natacion(2), atletismo(3), basquetball(4),"
                    + "ciclismo(5), tenis(6), yoga(7)");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    registrarParticipanteFutbol();
                    break;
                case 2:
                    registrarParticipanteNatacion();
                    break;
                case 3:
                    registrarParticipanteAtletismo();
                    break;
                case 4:
                    registrarParticipanteBasquetball();
                    break;
                case 5:
                    registrarParticipanteCiclismo();
                    break;
                case 6:
                    registrarParticipanteTenis();
                    break;
                case 7:
                    registrarParticipanteYoga();
                    break;
            }

        }

    }
}
