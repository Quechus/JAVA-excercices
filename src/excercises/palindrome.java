package excercises;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println("Ingrese el tamaño: ");
        String cadena = entradaEscaner.nextLine(); 
		cadena = cadena.toLowerCase();
		System.out.println(cadena);
		boolean isPalindrome = false;
		char[] palindromoArray = new char[3];
		palindromoArray = cadena.toCharArray();
		
		//indicador de posicion final
		int finalChar = palindromoArray.length-1;
		
		if(finalChar==0) {
			isPalindrome = true;
		}
		
		for (int i = 0; i < palindromoArray.length-1; i++) {
			
			if(((palindromoArray.length % 2 == 0)&&(i == finalChar-1)) || (palindromoArray.length % 2 != 0) && (i == finalChar)) {
				if(palindromoArray[i] == palindromoArray[finalChar]) {
					isPalindrome=true;
				}
				break;
			}
			if(palindromoArray[i] != palindromoArray[finalChar]) {
				isPalindrome = false;
				break;
			}
			finalChar -= 1;
		}
		
		
		if(isPalindrome) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		
		
	}
}
