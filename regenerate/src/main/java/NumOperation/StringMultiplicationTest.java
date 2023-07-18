package NumOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringMultiplicationTest {
    @Test
    public void testMultiply() {
        StringMultiplication multiply = new StringMultiplication();

        String num1 = "123";
        String num2 = "456";
        String expected = "56088";

        long startTime = System.nanoTime();
        String result = multiply.multiply(num1, num2);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Result: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}