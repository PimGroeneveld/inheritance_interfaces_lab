import com.sun.prism.impl.packrect.RectanglePacker;

public class Stereo extends Component {

    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;

    private String name;

    public Stereo(String name, String make, String model, Radio radio, CDPlayer cdPlayer, RecordDeck recordDeck){
        super(make, model);
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
    }

    public String getName() {
        return name;
    }

    public String canTune(){
        return radio.tune();
    }

    public String canPlayMusic(){
        return cdPlayer.play();
    }

    public int getPlaySpeed(){
        return recordDeck.getPlaySpeed();
    }


}
