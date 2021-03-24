package Operaciones;

/**
 * Contiene las funciones basicas de una calculadora
 */
public class Calculadora {
    /**
     * Suma dos numeros
     * @param num1 primer sumando
     * @param num2 segundo sumando
     * @return resultado de la suma
     */
    public int suma(int num1, int num2){
        return num1+num2;
    }

    /**
     * Multiplica dos numeros
     * @param num1 primer multiplo
     * @return Producto de ambos numeros
     */
    public int multiplicacion(int num1, int num2){
        return num1*num2;
    }

    /**
     * Resta el segundo numero al primero
     * @param num1 numero al que se resta
     * @param num2 cantidad que se sustrae
     * @return Resta del num1 menos el num2
     */
    public int resta(int num1, int num2){
        return num1-num2;
    }

    /**
     * Divide dos numeros
     * @param num1 dividendo
     * @param num2 divisor
     * @return Division del num1 entre el num2
     */
    public int division(int num1, int num2){

        return num1/num2;
    }

}
