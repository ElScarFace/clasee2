package clasee2;

import java.util.Scanner;
//renzo delgado//
public class clase11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese numero: ");
		int n=sc.nextInt();
		String dia="";
		switch (n) {
		case 1:
			dia="domingo";break;
		case 2:
			dia="lunes";break;
		case 3:
			dia="martes";break;
		case 4:
			dia="miercoles";break;
		case 5:
			dia="jueves";break;
		case 6:
			dia="viernes";break;
		case 7:
			dia="sabado";break;
			default:
				dia="dia desconocido";	
		}
		
	System.out.println("dia "+dia);	
		
	}

}
