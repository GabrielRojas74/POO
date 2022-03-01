import java.util.Scanner;
import java.util.ArrayList;
class Main {
  
  private static Scanner readerint= new Scanner(System.in);  
  private static Scanner readerf= new Scanner(System.in); 
  // Se declara un ArrayList
    public static ArrayList<Float> lista = new ArrayList<Float>();
  
    public static float promedio (ArrayList<Float> lista)
  
  {//decla
    int suma=0;
    int cant_notas=0;
    int prom=0;
    float total;
    cant_notas = lista.size();
    //rec
  for (int i = 0; i < cant_notas; i++) {
    suma += lista.get(prom);
    prom+=1;
  }
  total = suma/cant_notas;
   //ret     
  return total;
    }
//pri
  public static void main(String[] args) {
    float notas;
    int num= 0;
  System.out.println("\nPreguntar al usuario cuántas notas desea ingresar, solicitar las notas y almacenarlas en una lista. Cree una función que reciba la lista y retorne el promedio.\n ");
  System.out.println("ingrese el numero de notas: ");
    int veces =readerint.nextInt();
    do {
      
      System.out.println("escriba la nota: ");
      notas = readerf.nextFloat();
      lista.add(notas);
      num += 1;
    } 
  while (num<veces);//fin
    //imp tot
      float totalprom = promedio(lista);
        System.out.println("el promedio es: "+totalprom);
  }

}

    
