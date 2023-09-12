/**
 * IllegalQuantityException is used to handle exception (checked exception).
 * @author Nhat Le
 * @version 1.0
 */
public class IllegalQuantityException extends Exception {
    /**
     * This constructor check whether not the String pass in is a number.
     * @param val take in a string value.
     */
    public IllegalQuantityException(String val) {
        super("Quantity is not a number.");
    }
}
