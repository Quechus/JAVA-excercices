package excercises;

import java.util.Scanner;

/**
 * Ejercicio que pinta un rectangulo 
 * dependiendo de la cantidad de lineas deseado
 * **/

public class squareAsterisks {
	public static void main (String arg[]){
		String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println("Ingrese el tamaño: ");
        entradaTeclado = entradaEscaner.nextLine(); 
        
        try {
        	int numAsteriscos = Integer.parseInt(entradaTeclado);
        	for (int i = 0; i < numAsteriscos; i++) {
    			if( i != 0 ) {
    				System.out.println();
    			}
    			for (int j = 0; j < numAsteriscos; j++) {
    				if( i != 0 && i != numAsteriscos - 1) {
    					if(j > 0 && j < numAsteriscos - 1) {
    						System.out.print(' ');
    					} else {
    						System.out.print('*');
    					}
    				} else {
    					System.out.print('*');
    				}	
    			}
    		}			
         
		} catch (Exception e) {
			e.printStackTrace();  
		}
        
	}	
}
