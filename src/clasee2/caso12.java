package clasee2;
import java.util.Scanner;
public class caso12 {
//renzo delgado//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("empleado: ");
String empleado=sc.nextLine();
System.out.println("nivel(1-4):");
int nivel=sc.nextInt();
System.out.println("sueldo:");
float sueldo=sc.nextFloat();

float inc=0;
switch (nivel) {
case 1:
	inc=0.045f;break;
case 2:
	inc=0.06f;break;
case 3:
	inc=0.085f;break;
case 4:
	inc=0.11f;break;

}
float nuevosueldo=sueldo+(sueldo*inc);
System.out.println("--------------");
System.out.println("resultados");
System.out.println("-------------");
System.out.println("incremento:"+inc*100+"%");
System.out.println("nuevo sueldo: "+(nuevosueldo));
}

}
