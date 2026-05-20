import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ParkingSystemTest{

    @Test
    public static void testThatParkingSlotIsEmpty(){
        //givin
        int[] given = {20};

        //actual
        ParkingSystem function = new ParkingSystem();
        int [] actual = function.slots(given);
         
        //expected
        int [] result = "total";

        assertArrayEquals(actual, result);

}
}
