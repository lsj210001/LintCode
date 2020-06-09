import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class APlusBTests {
    private final APlusB aPlusB = new APlusB();

    @Test
    void trailingZerosTest() {
        assertEquals(3, aPlusB.aplusb(1, 2));
    }
}
