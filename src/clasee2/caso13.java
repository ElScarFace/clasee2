package clasee2;

import java.util.Scanner;

public class caso13 {
//renzo delgado//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
System.out.println("ingrese primer numero: ");
int num1=sc.nextInt();
System.out.println("ingrese segundo numero: ");
int num2=sc.nextInt();
System.out.println("ingrese operacion(1-6): ");
int oper=sc.nextInt();
String hacer="";
int opera=0;

switch (oper) {
case 1:
	hacer="suma";
	opera=num1+num2;break;
case 2:
	hacer="resta";
	opera=num1-num2;
case 3:
	hacer="producto";
	opera=num1*num2;break;
case 4:
	hacer="division";
	opera=num1/num2;break;
case 5:
	hacer="resto entero";
	if (num2==0) 
		hacer="no es posible hallar";
	else 
		opera=num1%num2;break;
	
case 6:
	hacer="promedio";
	opera=(num1+num2)/2;break;
	default:
	opera=0;
}
	
System.out.println("numero 1: "+num1);	
System.out.println("numero 2: "+num2);
System.out.println("operacion:"+hacer);
System.out.println("resultado: "+opera);
	}

}
