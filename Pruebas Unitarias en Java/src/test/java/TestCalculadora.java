import org.example.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculadora {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.resta(5, 3));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicacion(3, 5));
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.division(10, 5), 0);
    }

    @Test
    public void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        calc.division(10, 0);
    }
}
