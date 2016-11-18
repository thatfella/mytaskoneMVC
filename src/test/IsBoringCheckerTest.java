import org.junit.Test;
public class IsBoringCheckerTest
{
    @Test
    public void testIsBoring() {
        IsBoringChecker ibc = new IsBoringCheckerTest();
        assertEquals("Is Boring", ibc.check(10000001));
    }

}
}
