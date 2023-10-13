import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFindMax {
    @Test
    void checkFindMax(){
        assertEquals(9, Main.findMax(2, 5, 9));
    }
}