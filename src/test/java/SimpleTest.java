import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    void assertTrueTests() {
        assertTrue(3 > 1);
    }
    @Test
    void assertFalseTests(){
        assertFalse(3<2);
    }
}

