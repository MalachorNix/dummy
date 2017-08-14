import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void firstTest() {
        assertEquals(2L, 1L + 1L);
    }

    @Test
    public void secondTest() {
        assertEquals(4L, 2L + 2L);
    }
}
