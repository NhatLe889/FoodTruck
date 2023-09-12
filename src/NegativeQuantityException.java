/**
 * NegativeQuantityException is used to handle exception (unchecked exception).
 * @author Nhat Le
 * @version 1.0
 */
public class NegativeQuantityException extends RuntimeException {
    /**
     * This constructor check whether the value
     * pass in is positive.
     * @param val take in a String value that a number.
     */
    public NegativeQuantityException(String val) {
        super("Quantity is not positive.");
    }
}
