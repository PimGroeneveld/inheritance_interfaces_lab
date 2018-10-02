import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before(){
        Radio radio = new Radio();
        CDPlayer cdPlayer = new CDPlayer("Awesome corp", "The best", 5);
        RecordDeck recordDeck = new RecordDeck("Awesome corp", "The best", 2);
        stereo = new Stereo("Music Box", "Awesome corp", "The best", radio, cdPlayer, recordDeck);
    }

    @Test
    public void canGetName(){
        assertEquals("Music Box", stereo.getName());
    }

    @Test
    public void canGetMake(){
        assertEquals("Awesome corp", stereo.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("The best", stereo.getModel());
    }

    @Test
    public void canTune(){
        assertEquals("Radio 1", stereo.canTune());
    }

    @Test
    public void canPlay(){
        assertEquals("Music sounds!", stereo.canPlayMusic());
    }

    @Test
    public void canGetPlaySpeed(){
        assertEquals(2, stereo.getPlaySpeed());
    }

}
