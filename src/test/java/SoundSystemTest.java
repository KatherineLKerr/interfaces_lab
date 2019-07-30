import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoundSystemTest{

    SoundSystem soundSystem;

    @Before
    public void setUp() {
        soundSystem = new SoundSystem("harry");
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

    
}
