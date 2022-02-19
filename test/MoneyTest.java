import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testMoneyMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(five.amount, 10);
    }
}
