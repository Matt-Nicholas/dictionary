
import java.util.ArrayList;
import java.util.List;


public class Word{
    private static List<Word> INSTANCES = new ArrayList<Word>();
    private int mId;
    private List<Definition> mDefinitions = new ArrayList<Definition>();
    // Constructor
    public Word(String _word){
        INSTANCES.add(this);
        mId = INSTANCES.size() - 1;
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
