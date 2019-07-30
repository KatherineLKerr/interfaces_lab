import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer caddy;

    @Before
    public void before() {
        caddy = new CDPlayer("cdplayer brand", "cdplayer model", 5);

    }

    @Test
    public void canHaveMake() {
        assertEquals("cdplayer brand", caddy.getMake());
    }

    @Test
    public void canGetNumberOfCds() {

        assertEquals(5, caddy.getNumberOfCds());

    }

}
