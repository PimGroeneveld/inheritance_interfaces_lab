import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Tech company", "The best", 2);
    }

    @Test
    public void getPlaySpeed() {
        assertEquals(2, recordDeck.getPlaySpeed());
    }

    @Test
    public void setPlaySpeed() {
        recordDeck.setPlaySpeed(4);
        assertEquals(4, recordDeck.getPlaySpeed());
    }

    @Test
    public void canGetMake(){
        assertEquals("Tech company", recordDeck.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("The best", recordDeck.getModel());
    }
}