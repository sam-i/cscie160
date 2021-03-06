package cscie160.hw2;

/**
 * Elevator capacity reached exception class.
 * 
 * @author Reagan Williams
 * @version 1.2 (hw2)
 * @since 2011-09-27
 */
public class CapacityReachedException extends Exception
{
    /**
     * Capacity reached constructor
     *
     * @param msg exception message string
     */
    public CapacityReachedException(String msg)
    {
        super(msg);
    }
}
