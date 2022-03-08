import java.util.Scanner;
public class Main {
  public static Scanner info= new Scanner (System.in);
  public static Scanner info2= new Scanner (System.in);
  public static void main (String[]args){
    String nombre, color;
    int energia, comida, x, y, horas, juego;
    System.out.println("Bienvenido al tamagochi ean");
    
    System.out.println("Cual es el nombre del gato?: ");
    nombre= info2.nextLine();
    System.out.println("Cual es el color de "+nombre+"?");
    color= info2.nextLine();
    System.out.println("Cuanta energia tiene "+nombre+"?");
    energia= info.nextInt();
    
    System.out.println("Cual es el nivel de alimento de "+nombre+"?");
    comida= info.nextInt();
    
    System.out.println("·Que quieres hacer con "+nombre+"?"+"\n"+"·1 alimentarlo"+"\n"+ "·2 jugar "+"\n"+"·3 dormir"+"\n"+"·4 salir");
    y= info.nextInt();  

 // Creación del objeto Paco que pertenece a la clase Gato (Instancia)
    Gato Paco= new Gato(nombre, color, energia, comida);
    
      switch(y){
        case 1: {
        System.out.println("·Cuanta comida quiere darle a "+nombre+"?");
        x= info.nextInt();
        Paco.comer(x);
        break;
          }
        case 2: {
        System.out.println("·Cuantas veces quieres jugar con "+nombre+"?");
        juego= info.nextInt();
        
        Paco.jugar();
          
        break;}
        case 3: {
        System.out.println("\n"+"·Cuantas horas va a dormir  "+nombre+"?"+" (de 1 a 5 horas)");
        horas=info.nextInt();
        Paco.dormir(horas);       
        break;}
        case 4:{
          break;
        }
       default: {
	    System.out.println("Opcion incorrecta");
	    }
          
    
     
     } // fin del while true
    
    } 
    
  }