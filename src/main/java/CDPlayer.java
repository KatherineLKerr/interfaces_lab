import java.util.HashMap;

public class CDPlayer extends Component{

    private int numberOfCds;
    private int currentlyPlaying;
    private HashMap<Integer,String> cds;

    public CDPlayer(String make, String model, int numberOfCds) {
        super(make, model);
        this.numberOfCds = numberOfCds;
        currentlyPlaying = 0;
        cds = new HashMap<Integer, String>();
        cds.put(0,"Steph the cd");
        cds.put(1,"Harrison the cd");
        cds.put(2,"George the cd");


    }

    public int getNumberOfCds() {
        return this.numberOfCds;
    }

    public int getCurrentlyPlaying() {
        return this.currentlyPlaying;
    }

    public void setCurrentlyPlaying(int currentlyPlaying) {
        this.currentlyPlaying = currentlyPlaying;
    }
}
