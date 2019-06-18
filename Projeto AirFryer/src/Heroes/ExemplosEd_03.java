package Heroes;

import java.util.Scanner;

public class ExemplosEd_03 {
	public static void main(String[]args) {
		Scanner shallow = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número de 0 a 6");
		number = shallow.nextInt();
		switch (number) {
		case 0 : 
			System.out.println("HOJE É DOMINGO");
			break;
		case 1 :
				System.out.println("HOJE É SEGUNDA");
				break;
		case 2 : 
				System.out.println("HOJE É TERÇA");
				break;
		case 3 :
				System.out.println("HOJE É QUARTA");
				break;
		case 4 :
				System.out.println("HOJE É QUINTA");
				break;
		case 5 :
				System.out.println("HOJE É SEXTA");
				break;
		case 6 : 
				System.out.println("HOJE É SÁBADO");
				break;
		default :
			 	System.out.println("PARA DE SER DOENTE, N EXISTE ESSE DIA");
			 	break;
			 	
		}
		shallow.close();
		
	}
}
