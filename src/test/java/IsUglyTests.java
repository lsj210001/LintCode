import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsUglyTests {
    private final IsUgly isUgly = new IsUgly();

    @Test
    void isUglyTest() {
        assertTrue(isUgly.isUgly(1));
        assertFalse(isUgly.isUgly(14));
    }
}
