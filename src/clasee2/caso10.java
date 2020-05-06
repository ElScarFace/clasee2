package clasee2;
import java.util.Scanner;
public class caso10 {
//renzo delgado//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
System.out.println("Ingrese nombre: ");
String nombre = sc.next();
System.out.println("Ingrese horas trabajadas:");
float hora= sc.nextFloat();
System.out.println("Tarifa por hora: ");
float tarifa= sc.nextFloat();
System.out.println("Ingrese minutos de tardanza(en caso tenga)");
float tarda = sc.nextFloat();

float importe = hora*tarifa;
float boni;
float des;

if(hora>60) 
	boni = (float)(importe*0.13);
else 
	boni = (float)(importe*0.04);
if(tarda>15) 
	des =(float)(importe*0.03);
else 
	des = 0;

float meta = (hora/0.7f);

System.out.println("Resultados");
System.out.println("Horas trabajadas: "+hora);
System.out.println("Tarifa por horas: "+tarifa);
System.out.println("Importe: "+importe);
System.out.println("Bono: "+ boni);
System.out.println("Descuento: "+des);
System.out.println("Meta alcanzada: "+meta+"%");
 
	 
 
	}

}
