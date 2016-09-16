
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Word{
    private static List<Word> WORDS = new ArrayList<Word>();
    private String mWord;
    private int mId;
    private List<Definition> mDefinitions = new ArrayList<Definition>();
    // Constructor
    public Word(String _word){
        mWord = _word;
        mId = WORDS.size();
        WORDS.add(this);
    }
    public String getWord(){
        return mWord;
    }
    // returns all instances of Word
    public static List<Word> all(){
        return WORDS;
    }
    // returns instance ID
    public int getId(){
        return mId;
    }
    // returns word object
    public static Word find(int Id){
        return WORDS.get(Id);
    }
    public void setDefinition(Definition _definition){
        mDefinitions.add(_definition);
    }
    public List<Definition> getDefinitions(){
        return mDefinitions;
    }
    public static void clear() {
        WORDS.clear();
  }
}
