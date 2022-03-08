import java.util.Scanner;
public class Gato {
  
  String raza;
  private String color;
  int energia;
  int nivelcomida;

  //Constructor de la clase Gato
  public Gato(String raza, String color, int energia, int nivelcomida){
    super();
    this.raza=raza;
    this.color=color;
    this.energia=energia;
    this.nivelcomida=nivelcomida;
        
  }
  // metodo para dar de comer al gato
  public void comer(int comida){
    if (this.nivelcomida<=100){
    System.out.println("el gato esta lleno");
      }
    else{
    this.nivelcomida=nivelcomida+comida;
    System.out.println("el nivel de comida es de "+ this.nivelcomida+"%");
      }
    
  }
  //metodo para hacer dormir al gato
  public void dormir(int horas){
    if (this.energia<=100){
    System.out.println("el gato tiene la energia completa");
      }
    else{
    
    switch (horas){
      case 1: {
        this.energia=energia+1;
      System.out.println("El gato tiene "+ this.energia+ " % de energia");
      
      break;}
      case 2:{
        this.energia=energia+2;
    System.out.println("El gato tiene "+ this.energia+ " % de energia");
      
      break;}
      case 3:{
        this.energia=energia+3;
    System.out.println("El gato tiene "+ this.energia+ " % de energia");
      
      break;}
      case 4:{
        this.energia=energia+4;
    System.out.println("El gato tiene "+ this.energia+ " % de energia");
      }
      break;
      case 5:{
        this.energia=energia+5;
    System.out.println("El gato tiene "+ this.energia+ " % de energia");
          
      break;}
    }
      }
  }
  // En este metodo podremos jugar con el gato
  public void jugar(){
    
    if (this.energia<=0  || this.nivelcomida<=0){
      System.out.print("El gato no quiere jugar, su energia es del " + this.energia+"% ");
      }
    else {
        
      this.energia-=5;
      this.nivelcomida-=5;
      System.out.print("\n"+"A el gato le encata jugar"+"\n"+"su nivel de energia es del "+this.energia+"%"+"\n"+"y su nivel de comida es del " +this.nivelcomida+"%");
       
       
      }
      
      }
  }