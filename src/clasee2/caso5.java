package clasee2;
import java.util.Scanner;
public class caso5 {
//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("ingrese precio: ");
float precio=sc.nextFloat();
System.out.println("ingrese cantidad: ");
float cantidad=sc.nextInt();

float total=(int) (precio*cantidad);
float descuento=(float) (total*0.1);

if (cantidad>8)
    descuento=(float)(total*0.1);
else
	descuento=0;

System.out.println("total: "+total);
System.out.println("descuento: "+ descuento);
System.out.println("neto: "+(total-descuento));

	}

}
