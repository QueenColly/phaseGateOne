import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class FaceBookTest {

    @Test
    public static void TestThatNooneLikesThis(){
    //given
    int given = 0;
    //actual
    Facebook facebook = new Facebook();
    int actual = Facebook.getlikes(given)
    //expected
    int expected = "Noone likes this"

    assertEquals(actual, result);
}

}
   
