import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitCountsTests {
    private final DigitCounts digitCounts = new DigitCounts();

    @Test
    void digitCountsTest() {
        assertEquals(5, digitCounts.digitCounts(1,12));
    }
}
