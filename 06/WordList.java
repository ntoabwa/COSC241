package week06;

public class WordList {
  
  
  //The first word in this WordList.
  private String first;
  
  //The remaining words in this WordList.
  private WordList rest;

 
  
  //Creates a new empty WordList.
  public WordList(){
    this.first = "";
    this.rest = null;
  }
  
  
  
  
  //Creates a new WordList consisting of 'word' joined to the 
  //front of 'rest'.
  public WordList (String word, WordList rest){
      this.rest = rest;
      first = word;
    
  }
  
  
  
  
  //Returns a new WordList by adding 'word' to this WordList.
  public WordList add(String word){
      return new WordList (word, this);
  }
  
  
  
  //Returns true if this WordList contains 'word' otherwise false.
  //Must be Recursive.
  public boolean contains (String word){

      if(isEmpty())
          return false;
      if(first.equals(word))
          return true;
      return rest.contains(word);
      
  
  }
  
  
  //Returns true if this WordList is empty, otherwise false.
  public boolean isEmpty(){
      return rest == null;
  }
  
  
  
  
  //Returns how many words are in this WordList.
  //Must be recursive.
  public int size(){
    if (rest == null){
      return 0;
    } else{
      return 1 + rest.size();
    }
  }
  
  
  
  
  //Returns a String representation of this WordList consisting of 
  //each word in the order they were added separated by spaces.
  //Must be recursive.
  public String toString(){
      if(isEmpty())
          return "";
      if(rest.isEmpty())
          return first;
      return rest.toString()+" "+first;
     
  
  
}

}
