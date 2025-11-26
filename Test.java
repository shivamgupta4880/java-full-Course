import java.math.BigDecimal;
import java.math.MathContext;

public class Test {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("3.14159265358", new MathContext(3));
        System.out.print(x);
    }
}