import org.junit.Test;

public class EvenCheckerTest {
    @Test
    public void testIsEven() {
        IsEvenChecker ie = new IsEvenChecker();
        assertEquals("NOT even", ie.check(23));
    }

}