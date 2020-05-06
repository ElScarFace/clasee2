package clasee2;
import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String alumno="";
int nota1=0, nota2=0;
float asistencia=0;
System.out.println("ingrese nombre del alumno: ");
alumno=sc.nextLine();
System.out.println("ingrese primera nota: ");
nota1=sc.nextInt();
System.out.println("ingrese segunda nota: ");
nota2=sc.nextInt();
System.out.println("ingrese numero de asistencias: ");
asistencia=sc.nextFloat();
float promedio2=(float)(nota1*0.3);
float promedio3=(float)(nota2*0.7);
float todo=(float)(promedio2+promedio3);
asistencia=(float)(asistencia/0.12*1);
String estado="";

if (todo>13 == asistencia>0.7)
	estado="aprovado";
else 
	estado="desaprovado";
	

System.out.println("----------------");
System.out.println("...resultados...");
System.out.println("----------------");
System.out.println("Alumno: "+alumno);
System.out.println("Promedio: "+todo);
System.out.println("asistencia: "+asistencia+"%");
System.out.println("estado: "+estado);



	}

}
