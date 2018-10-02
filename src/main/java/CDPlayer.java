public class CDPlayer extends Component{

    private int nrCDs;

    public CDPlayer(String make, String model, int nrCDs){
        super(make, model);
        this.nrCDs = nrCDs;
    }

    public int getNrCDs() {
        return nrCDs;
    }

    public String play(){
        return "Music sounds!";
    }
}
