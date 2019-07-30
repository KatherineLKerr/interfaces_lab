import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {

    Radio raddy;
    @Before
    public void banana(){
        raddy =  new Radio("radio brand","radio model");
    }

    @Test
    public void canHaveMake(){
        assertEquals("radio brand",raddy.getMake());
    }

    @Test
    public void canHaveModel(){
        assertEquals("radio model",raddy.getModel());
    }

    @Test
    public void canPlay(){
        raddy.setFrequency(10056);
        assertEquals("now playing 10056. bzzzzzzt",raddy.play());
    }

}
