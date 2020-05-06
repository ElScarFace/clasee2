package clasee2;
import java.util.Scanner;
public class caso15 {
//renzo delgado//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
String cliente, TB, LT, MN, IM, producto="",fp="",nombre,nombreFP="";
int valor = 0,cantidad=0;
float importe = 0,des=1, incre=1,porcentaje=0,total=0;

System.out.print("Ingrese cliente: ");
cliente = sc.next();
System.out.print("Ingrese producto: ");
producto = sc.next();
		switch(producto) {
		case "TB":
			valor = 350;
			nombre="Tabled";
			break;
		case "tb":
			valor = 350;
			nombre="Tabled";
			break;
		case "LT":
			valor = 2300;
			nombre="Laptop";
			break;
		case "lt":
			valor = 2300;
			nombre="Laptop";
			break;
		case "MN":
			valor = 850;
			nombre="Monitor";
			break;
		case "mn":
			valor = 850;
			nombre="Monitor";
			break;
		case "IM":
			valor = 680;
			nombre="Impresora";
			break;
		case "im":
			valor = 680;
			nombre="Impresora";
			break;
		default:
			valor = 0;
			nombre="Dato invalido";
			break;			
	}
System.out.print("Ingrese cantidad: ");
cantidad = sc.nextInt();

importe = cantidad * valor;

System.out.print("Ingrese forma de pago<C1,C2>: ");
fp= sc.next();
	switch(fp) {
	case "C1":
		des = 0.05f;
		nombreFP="Contado.";
		porcentaje = (importe*des);
		total=importe-porcentaje;break;
	case "C2":
		incre = 0.12f;
		nombreFP="Crédito";
		porcentaje = (importe*incre);
		total=importe+porcentaje;break;
		}
		
System.out.println("Cliente: "+cliente);
System.out.println("Producto: "+nombre);
System.out.println("Precio: "+valor);
System.out.println("Cantidad: "+ cantidad);
System.out.println("Importe: "+importe);

System.out.println("Forma de pago: "+nombreFP);
	switch(nombreFP) {
	case "Contado":
		System.out.println("Descuento: "+ porcentaje);
		break;
	case "Crédito":
		System.out.println("Incremento: "+ porcentaje);
	}
	
System.out.println("Total a pagar: "+total);
}
	
}
