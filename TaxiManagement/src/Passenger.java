import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Passenger {

    public static enum DESTINATION 
    {
        WHITEFIELD, SARJAPUR, KRPURAM, INDIRANAGAR, MGROAD, HEBBAL, JAYANAGAR, PEENYA, HSRLAYOUT, KORAMANGASLA
    }
    public static final DESTINATION[] DESTINATION_VALUES = DESTINATION.values();


    private DESTINATION destination;
    private static int id;
    
    public Passenger(DESTINATION dest)
    {
        destination = dest;
        id++;
    }
    
    public DESTINATION getDestination() 
    {
        return destination;
    }
    
    public int getId()
    {
    	return id;
    }
}
