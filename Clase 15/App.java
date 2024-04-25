import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
     
      public static float cociente(float numerador, float denominador) throws Exception{
        float resultado = numerador / denominador;
        return resultado;
      }
        
     public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        do {

            try {
                System.out.println("Ingrese el numerador");
                float numerador = sc.nextFloat();
                System.out.println("Ingrese el denominador");
                float denominador = sc.nextFloat();

                System.out.println("Resultado: "+cociente(numerador, denominador));

                continuar = false;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println(inputMismatchException);
                sc.nextLine();
                System.out.println("La operacion solo se puede realizar con valores numericos, intente otra vez");
            }catch(ArithmeticException arithmeticException) {
                System.out.println(arithmeticException);
                System.out.println("La operacion no es divisible entre 0");
            }finally{
                System.out.println("Este es el bloque que siempre ocurre");
            }
            
        } while (continuar);

    }

    

}
