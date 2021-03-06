package week03;

/**
 *  A recursive representation of a tower of blocks.
 *
 * @author Michael Albert
 */
public class Tower{

    /** The top block. */
    private char top;
    
    /** The rest of the tower. */
    private Tower rest;

    /**
     * Creates a new empty Tower.
     */
    public Tower() {
        this.top = ' ';
        this.rest = null;
    }
    
    /**
     *  External classes can only create empty towers and manipulate
     *  them using public methods, because this constructor is
     *  private.
     * @param top the top block in this tower
     * @param rest the rest of the tower
     */
    private Tower(char top, Tower rest) {
        this.top = top;
        this.rest = rest;
    }

    /**
     *  Returns true if this tower is empty, otherwise false.  Empty
     *  towers are represented with the top block being a space
     *  character.
     * @return whether the tower is empty or not.
     */
    public boolean isEmpty() {
        return top == ' ';
    }
        
    /**
     *  Creates a new tower by adding the given block to the top of
     *  this tower.
     * @param block a block to add to the top of this tower.
     * @return a new tower created by adding a block to the top of
     * this tower.
     */
    public Tower add(char block) {
        return new Tower(block, this);
    }

    /**
     * Recursive method that returns an int equal to the height of the tower.
     * Works by counting the number of the top block and calling the
     * method repeatedly on the rest of the tower.
     * @return the number of blocks in a tower
     */
    public int height(){
        if(rest==null){
            return 0;
        }
        return 1+rest.height();
    }

    /**
     * Method that call itself repeatedly until the top block is
     * equal to the input char c and then start to count the number of blocks.
     * @return the number of blocks when the top block is equal c.
     * @param c as the character input.
     */
    public int count(char c){
        if(rest==null){
            return 0;
        }else if(c==top){
            return 1+ rest.count(top);
        }else{
            return 0+ rest.count(c);
        }

    }
    
}
