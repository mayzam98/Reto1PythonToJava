/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import clases.*;
import java.util.Scanner;

/**
 *
 * @author mayko
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // TODO code application logic here
        int reto = 100;
        while (reto != 0 ){
            System.out.println("\n---------------------------------------");
            System.out.println("---------------------------------------");
            System.out.println("Ingrese el numero correspondiente al reto a iniciar: ");
            System.out.println("1-Bajo el radar\n2-segundo reto\n3-tercer reto\n4-cuarto reto\n5-quinto reto\n -cualquier numero para salir");
            reto = in.nextInt();
            switch (reto){
                case 1:
                    System.out.println("Ingrese la distancia uno en metros: ");
                    float distanciaUno = in.nextFloat();
                    System.out.println("Ingrese la distancia dos en metros: ");
                    float distanciaDos = in.nextFloat();
                    System.out.println("Ingrese el lapso de tiempo en minutos");
                    float tiempo = in.nextFloat();
                    bajoRadar multaRadar = new bajoRadar();
                    System.out.println(multaRadar.multarVelocidad(distanciaUno, distanciaDos, tiempo));                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                    
                    
                default:
                    reto = 0;
                    break;
            }
            
        }  
    }   
}