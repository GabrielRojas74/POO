import java.util.Scanner;

class Main {

    private static Scanner reader;

    public static void main(String[] args) {

        reader = new Scanner(System.in); 
    int valor1 = 0; 
    int valor2 = 0; 
    int contadormult3 = 0; 
    int contadormult5 = 0;

        System.out.println("Favor ingresar el primer número ");
        valor1 = reader.nextInt(); 
 
        System.out.println("Favor ingresar el segundo número ");
        valor2 = reader.nextInt();
        contadormult3 = 0;
        contadormult5 = 0;

        while (valor1 <= valor2) {
            if (valor1 % 3 == 0) {
                contadormult3 = contadormult3 + 1;
            }

            if (valor1 % 5 == 0) {
                contadormult5 = contadormult5 + 1;
            }

            valor1 = valor1 + 1;
        }

        System.out.println(contadormult3);
        System.out.println(contadormult5);

    }
} 
