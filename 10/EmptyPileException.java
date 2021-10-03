package week10;

import java.util.*;
import java.io.*;

/**
 * Exceptions class that defines EmptyPileException.
 * @author Ngaaia.Toabwa.
 */
 
 
public class EmptyPileException extends Exception {
    static final long serialVersionUID = 42L;

   /**
    *enable error message to be displayed.
    */
    public EmptyPileException(String message) {
        super(message);
    }
}
