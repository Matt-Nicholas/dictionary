import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

    @Test
    public void word_instantiatesCorrectly_true() {
        Word testWord = new Word("Boolean");
        assertEquals(true, testWord instanceof Word);
    }


    @Test
    public void all_returnsAllInstancesOfWord_true() {
        Word firstWord = new Word("Boolean");
        Word secondWord = new Word("Array");
        assertEquals(true, Word.all().contains(firstWord));
        assertEquals(true, Word.all().contains(secondWord));
    }
    @Test
    public void id_returnsIdOfWord_1(){
        Word firstWord = new Word("Boolean");
        Word secondWord = new Word("Array");
        int expectedResult = 1;
        assertEquals(expectedResult, secondWord.getId());
    }

    @Test
    public void all_returnsAllDefinitinsInWord_true() {
        Word testWord = new Word("Boolean");
        Definition definitionOne = new Definition("trueORfalse");
        Definition definitionTwo = new Definition("falseORtrue");
        testWord.setDefinition(definitionOne);
        testWord.setDefinition(definitionTwo);
        assertEquals(true, testWord.getDefinitions().contains(definitionOne));
        assertEquals(true, testWord.getDefinitions().contains(definitionTwo));
    }



}
