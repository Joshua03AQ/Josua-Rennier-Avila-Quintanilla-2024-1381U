import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Sentencia simple(if simple)
        int edad = 18;
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }

        //sentencia ifelse
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad1 = sc.nextInt();
        if (edad1>=18) {
            System.out.println("Eres mayor de edad");
            
        } else {
            System.out.println("Eres menor de edad");
            
        }

    }
}
