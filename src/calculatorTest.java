import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.jupiter.api.Test;
 
public class calculatorTest {
 
  @Test
  void addsTwoPositiveNumbers() {
    assertEquals(5, calculator.add(2, 3));
  }
 
  @Test
  void addsNegativeNumbers() {
    assertEquals(-10, calculator.add(-4, -6));
  }
 
  @Test
  void addsWithZero() {
    assertEquals(7, calculator.add(0, 7));
  }
}
 
