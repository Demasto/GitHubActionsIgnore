import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void additional(){
        assertEquals(2,calculator.add(1,1));
    }
    @Test
    void difference(){
        assertEquals(3,calculator.dif(7,4));
    }
    @Test
    void multiplication(){
        assertEquals(400,calculator.mul(10,40));
    }
    @Test
    void division(){
        assertEquals(120,calculator.div(360,3));
    }
}
