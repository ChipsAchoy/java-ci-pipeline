import Operaciones.Calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Calculadora calculadora = new Calculadora();
        System.out.println("+ para suma\n- para restar\n/ para dividir\n* para multiplicar\n");
        Scanner in = new Scanner(System.in);

        String option = in.nextLine();
        System.out.println("Inserte el primer numero\n");
        int a = in.nextInt();
        System.out.println("Inserte el segundo numero\n");
        int b = in.nextInt();
        int result = 0;

        if (option.contains("+")){
            result = calculadora.suma(a,b);
        } else if (option.contains("-")){
            result = calculadora.resta(a,b);
        } else if (option.contains("*")){
            result = calculadora.multiplicacion(a,b);
        } else if (option.contains("/")){
            result = calculadora.division(a,b);
        }

        System.out.println("El resultado es: "+result);
    }
}
