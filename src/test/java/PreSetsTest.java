import org.junit.*;
import static org.junit.Assert.*;

public class PreSetsTest {

    @Test
    public void preSets() {
        PreSets testDefinition = new PreSets();
        assertEquals(true, testDefinition instanceof PreSets);
    }
}
