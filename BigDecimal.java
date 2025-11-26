import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalUsage {

    public static void main(Srings[] args) {
        // Create a BigDecimal with the value "3.14159265358" and a precision of 3
        BigDecimal x = new BigDecimal("3.14159265358", new MathContext(3));
        
        // Print the value of the BigDecimal
        System.out.print(x);
    }
}
