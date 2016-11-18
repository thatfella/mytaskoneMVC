import org.junit.Test;

public class DivisibleBySevenCheckerTest {
    @Test
    public void testIsDivBySeven() {
        IsDivisibleBySevenChecker idbs = new IsDivisibleBySevenChecker();
        assertEquals("Divisible by 7", idbs.check(14));
    }

}