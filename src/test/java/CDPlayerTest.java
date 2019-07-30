import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer caddy;

    @Before
    public void before() {
        caddy = new CDPlayer("cdplayer brand", "cdplayer model", 3);

    }

    @Test
    public void canHaveMake() {
        assertEquals("cdplayer brand", caddy.getMake());
    }

    @Test
    public void canGetNumberOfCds() {

        assertEquals(3, caddy.getNumberOfCds());
    }

    @Test
    public void canSetCurrentlyPlaying(){
        caddy.setCurrentlyPlaying(2);
        assertEquals(2,caddy.getCurrentlyPlaying());
    }

}
