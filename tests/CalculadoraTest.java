import Operaciones.Calculadora;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calc = new Calculadora();
    @org.junit.Test
    public void suma() {
        assertEquals(7, calc.suma(4,3));
        assertEquals(1, calc.suma(-7,8));
    }
    @org.junit.Test
    public void resta() {
        assertEquals(4, calc.resta(7,3));
        assertEquals(-23, calc.resta(2,25));
    }
    @org.junit.Test
    public void mult() {
        assertEquals(21, calc.multiplicacion(7,3));
        assertEquals(-18, calc.multiplicacion(-9,2));
    }
    @org.junit.Test
    public void div() {
        assertEquals(-4, calc.division(-9,2));
        assertEquals(7, calc.division(21,3));
    }
}