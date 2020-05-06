package clasee2;
import java.util.Scanner;
public class caso8 {
//renzo delgado//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("ingrese nota: ");
int nota=sc.nextInt();
String men="";
if (nota<00 == nota>07)
		men="Sin palabras";

else if (nota<8 == nota>10)
	men="malo";

else if (nota<11 == nota>14)
	men="regular";

else if (nota<15 == nota>17)
	men="notable";

else if (nota<18 == nota>20)
		men="excelente";
else
	men="";

System.out.println("estado obtenido: "+men);
	}

}
