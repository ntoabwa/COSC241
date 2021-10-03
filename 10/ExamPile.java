package week10;

import java.util.*;


public interface ExamPile {
    public void load(int[] items);
    public int size();
    public int peek();
    public int mark();
    public void delay();
}                      
