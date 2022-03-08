import java.util.Scanner;
public class Main {
  public static Scanner tod= new Scanner (System.in);
  public static Scanner stri= new Scanner (System.in);
  public static void main (String[]args){
    String nombre, color;
    int energia, comida, x, y, horas, juego;
    System.out.println("Bienvenido al tamagochi EAN");
    
    System.out.println("Cual es el nombre del gato?: ");
    nombre= stri.nextLine();
    System.out.println("Cual es el color de "+nombre+"?");
    color= stri.nextLine();
    System.out.println("Cuanta energia tiene "+nombre+"?");
    energia= tod.nextInt();
    
    System.out.println("Cual es el nivel de alimento de "+nombre+"?");
    comida= tod.nextInt();
    
    System.out.println("·Que quieres hacer con "+nombre+"?"+"\n"+"·1 alimentarlo"+"\n"+ "·2 jugar "+"\n"+"·3 dormir"+"\n"+"·4 salir");
    y= tod.nextInt();  

 // Creación del objeto Paco que pertenece a la clase Gato (Instancia)
    Gato Paco= new Gato(nombre, color, energia, comida);
    
      switch(y){
        case 1: {
        System.out.println("·Cuanta comida quiere darle a "+nombre+"?");
        x= tod.nextInt();
        Paco.comer(x);
        break;
          }
        case 2: {
        
        System.out.println("·Cuantas veces quieres jugar con "+nombre+"?");
        juego= tod.nextInt();
        for (int i=0; i<juego;i++){
        Paco.jugar();
        }
        break;}
        case 3: {
        System.out.println("\n"+"·Cuantas horas va a dormir  "+nombre+"?"+" (de 1 a 5 horas)");
        horas=tod.nextInt();
        Paco.dormir(horas);       
        break;}
        case 4:{
          break;
        }
       default: {
	    System.out.println("Opcion incorrecta");
	    }
       
     } 
    
    } 
    
  }
