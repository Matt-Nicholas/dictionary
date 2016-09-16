import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

    @Test
    public void definition_instantiatesCorrectly_true() {
        Definition testDefinition = new Definition("this is a test");
        assertEquals(true, testDefinition instanceof Definition);
    }
    @Test
    public void getDefinition_returnsDefinition_String() {
        Definition testDefinition = new Definition("this is a test");
        String expectedResult = "this is a test";
        assertEquals(expectedResult, testDefinition.getDefinition());
    }

}
