import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoundSystemTest{

    SoundSystem soundSystem;
    Radio raddy;

    @Before
    public void setUp() {
        soundSystem = new SoundSystem("harry");
        raddy = new Radio("cool radio","even cooler edition");
    }

    @Test
    public void canChangeName() {
        soundSystem.setName("Harry");
        assertEquals("Harry", soundSystem.getName());
    }

    @Test
    public void canChangeVolume(){
        soundSystem.raiseVolume();
        soundSystem.lowerVolume();
        soundSystem.lowerVolume();
        assertEquals(4,soundSystem.getVolume());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("connected to 105! yay!",soundSystem.tuneRadio(raddy,105));
    }


}
