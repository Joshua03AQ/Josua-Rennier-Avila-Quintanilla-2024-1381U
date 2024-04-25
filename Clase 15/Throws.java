import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
       
        try {
            lanzamientoexcepcion();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void lanzamientoexcepcion() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad<18) {
            throw new Exception("Excepcion creada por ser menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
    }

}
