package clasee2;
import java.util.Scanner;
public class clase6 {
//renzo delgado c://
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("ingrese sueldo:");
float sueldo=sc.nextFloat();
if (sueldo>2800)
	sueldo=(float)(sueldo*0.05);
else
	sueldo=(float)(sueldo*0.02);
System.out.println("impuesto calculado es: "+sueldo);
	}

}
