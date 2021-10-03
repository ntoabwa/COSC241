package week06;

public class Person{
  
    private static int count = 0;
    private int id;
    private String name = "";
    private int age = -1;
    private boolean children;
    private WordList sports = new WordList();
    
    
    public Person(){
      id = count;
      count++;
    }
    
    
    public int getID(){
      return id;
    }
    
    public String getName(){
      return name;
    }
    
    public int getAge(){
      return age;
    }
      
    public boolean hasChildren(){
      return children;
    }
    
    public WordList getSports(){
      return sports;
    }
    
    
    public void setName(String newName){
      this.name = newName;
    }
    
    public void setAge(int newAge){
      this.age = newAge;
    }
    
    public void setChildren(boolean newChildren){
      this.children = newChildren;
    }
    
    public void addSport(String sport){
        sports = sports.add(sport);
      
    }
    
    public String toString(){
      return "Person{id=" + id + ", name=" + name + ", age=" + age + ", sports=" + sports + ", children=" + children + "}";
      
    }
    
}
    
    
    
    
    
    
    
        
