package clasee2;
import java.util.Scanner;
public class caso2 {
//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num=0;
		System.out.println("ingrese el numero: ");
		num=sc.nextInt();
		if (num%2==0) 
			System.out.println("el mumero "+num +" es par.");
		else 
			System.out.println("el numero "+ num+ " es impar.");

	}
}
