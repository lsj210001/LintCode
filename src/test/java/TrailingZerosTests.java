import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrailingZerosTests {
    private final TrailingZeros trailingZeros = new TrailingZeros();

    @Test
    void aplusbTest() {
        assertEquals(2, trailingZeros.trailingZeros(11));
        assertEquals(1, trailingZeros.trailingZeros(5));
    }
}
