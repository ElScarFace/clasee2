package clasee2;
import java.util.Scanner;
public class caso7 {
//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("ingrese sueldo: ");
float sueldo=sc.nextFloat();
if (sueldo<=1500)
	sueldo=(float)(sueldo*0.03);
else if (sueldo>1500 == sueldo<3000)
	sueldo=(float)(sueldo*0.08);
else
	sueldo=(float)(sueldo*0.12);
System.out.println("impuesto calculado: "+sueldo);
	}
}
