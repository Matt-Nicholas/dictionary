public class PreSets{
    public void setWords(){
        String[] wordArray = new String[]{"Apple", "Pie", "Array", "Boolean", "String"};
        String[] defArray = new String[]{"A piece of fruit", "Deliciousness!", "A group of items", "True or False", "A group of characters"};
        for(int i = 0; i < wordArray.length; i++){
                Word tempWord = new Word(wordArray[i]);
                Definition tempDefinition = new Definition(defArray[i]);
                tempWord.setDefinition(tempDefinition);
        }
    }
}
