package Heroes;

import java.util.Scanner;

public class ExemplosEd_03 {
	public static void main(String[]args) {
		Scanner shallow = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um n�mero de 0 a 6");
		number = shallow.nextInt();
		switch (number) {
		case 0 : 
			System.out.println("HOJE � DOMINGO");
			break;
		case 1 :
				System.out.println("HOJE � SEGUNDA");
				break;
		case 2 : 
				System.out.println("HOJE � TER�A");
				break;
		case 3 :
				System.out.println("HOJE � QUARTA");
				break;
		case 4 :
				System.out.println("HOJE � QUINTA");
				break;
		case 5 :
				System.out.println("HOJE � SEXTA");
				break;
		case 6 : 
				System.out.println("HOJE � S�BADO");
				break;
		default :
			 	System.out.println("PARA DE SER DOENTE, N EXISTE ESSE DIA");
			 	break;
			 	
		}
		shallow.close();
		
	}
}
