import java.util.Scanner;

class Main {

    private static Scanner reader;

    public static void main(String[] args) {

        reader = new Scanner(System.in); 
    int valor1 = 0; 
    int valor2 = 0; 
    int contadorpar = 0; 
    int contadorin = 0;
    
      System.out.println("\nRealizar una función Calculo que solicite dos números enteros y calcule la suma de todos los números pares, por un lado, y por otro, la  de los impares que se encuentran en el rango. Mostrarla salida al usuario. No olvide usar el operador módulo (%) para realizar el ejercicio.\n");
      
        System.out.println("Favor ingresar el primer número ");
        valor1 = reader.nextInt(); 
 
        System.out.println("Favor ingresar el segundo número ");
        valor2 = reader.nextInt();
        contadorpar = 0;
        contadorin = 0;

        while (valor2 >= valor1) {
            if (valor1 % 2 == 0) {
                contadorpar = contadorpar +valor1;
            }

          else {
                contadorin = contadorin +valor1;
            }

            valor1 = valor1 + 1;
        }

        System.out.println("la suma de los números pares es= "+contadorpar);
        System.out.println("la suma de los números inpares es= "+contadorin);

    }
} 
