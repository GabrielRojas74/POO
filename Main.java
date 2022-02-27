//Solicitar dos números enteros al usuario y crear un menú usando switch case en la que si la opción es 1 se sumen los dos números, para la opción 2 se presente una resta, para la opción 3 la multiplicación y para la opción 4 se calcule el promedio. Mostrar al usuario el resultado de la operación.
import java.util.Scanner;
public class Main {
private static Scanner reader;
	public static void main(String[] args) {
  reader=new Scanner (System.in);
  System.out.println("\nSolicitar dos números enteros al usuario y crear un menú usando switch case en la que si la opción es 1 se sumen los dos números, para la opción 2 se presente una resta, para la opción 3 la multiplicación y para la opción 4 se calcule el promedio. Mostrar al usuario el resultado de la operación. \n");
  System.out.println("ingrese el primer numero");
		int numu=reader.nextInt();
  System.out.println("ingrese el segundo numero");
		int numd=reader.nextInt();
  System.out.println("ingrese el numero de la operacion (1:suma, 2:resta, 3:multiplicacion, 4:promedio)");
	int operacion=reader.nextInt();
    int x=0;
    float y=0;
	    switch (operacion){
	    case 1:{
      x=numu+numd;
	    System.out.println("el resultado de la suma es "+x);
	    break;
	    }
	    case 2:{
      x=numu-numd;
	    System.out.println("el resultado de la resta es "+x);
	    break;
	    }
      case 3:{
      x=numu*numd;
	    System.out.println("el resultado de la multiplicacion es "+x);
	    break;
	    }
      case 4:{
      y=(numu+numd)/2;
      System.out.println("el resultado del promedio es "+y);
	    break;
      }
      default: {
	    System.out.println("Opcion incorrecta");
	    }
	      }//cierra SWITCH

	} // cierre función main
} //cierre clase
