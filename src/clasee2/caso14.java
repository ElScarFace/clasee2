package clasee2;
import java.util.Scanner;

public class caso14 {
//renzo delgado//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
System.out.println("ingrese su nombre alumno: ");
String alumno=sc.nextLine();
System.out.println("ingrese carrera:<DS,RC,DG> ");
String carrera=sc.nextLine();
System.out.println("ingrese turno:<M,T,N> ");
 String turno=sc.nextLine();
float carrer=0, calculo=0, total=0, dolar=0;
String carrera1="", turno1="";
switch (carrera) {
case "DS":
	carrera1="DESARROLLO DE SOFTWARE";
	carrer=1500;break;
case "RC":
	carrera1="REDES Y CONECTIVIDAD ";
	carrer=1400;break;
case "DG":
	carrera1="DISEÑO GRAFICO";
	carrer=1300;break;
	default:
		carrer=0;
}
switch(turno) {
case "M":
	turno1="MAÑANA";
	calculo=(float)(carrer*0.1);break;
case "T":
	turno1="TARDE";
	calculo=(float)(carrer*0.2);break;
case "N":
	turno1="NOCHE";
	calculo=(float)(carrer*0.15);break;
	default:
		calculo=0;
}

total=(carrer-calculo);
dolar=(float)(total*3.33);
System.out.println("monto: "+carrer);
System.out.println("nombre del turno: "+ turno1);
System.out.println("descuento: "+calculo);
System.out.println("total a pagar: "+total);
System.out.println("equivalente en dolares: "+dolar);

	}
}
