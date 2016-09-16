
import java.util.ArrayList;
import java.util.List;


public class Word{
    private static List<Word> INSTANCES = new ArrayList<Word>();
    private String mWord;
    private int mId;
    private List<Definition> mDefinitions = new ArrayList<Definition>();
    // Constructor
    public Word(String _word){
        mWord = _word;
        mId = INSTANCES.size() - 1;
        INSTANCES.add(this);
    }
    public String getWord(){
        return mWord;
    }
    // returns all instances of Word
    public static List<Word> all(){
        return INSTANCES;
    }
    // returns instance ID
    public int getId(){
        return mId;
    }

    public void setDefinition(Definition _definition){
        mDefinitions.add(_definition);
    }
    public List<Definition> getDefinitions(){
        return mDefinitions;
    }


}
