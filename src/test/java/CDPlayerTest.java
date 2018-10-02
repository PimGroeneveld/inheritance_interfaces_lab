import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Tech company", "The best", 5);
    }

    @Test
    public void canGetNrCDs(){
        assertEquals(5, cdPlayer.getNrCDs());
    }

    @Test
    public void canPlay(){
       assertEquals("Music sounds!", cdPlayer.play());
    }

    @Test
    public void canGetMake(){
        assertEquals("Tech company", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("The best", cdPlayer.getModel());
    }

}