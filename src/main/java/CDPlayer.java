public class CDPlayer extends Component{

    private int numberOfCds;

    public CDPlayer(String make, String model, int numberOfCds) {
        super(make, model);
        this.numberOfCds = numberOfCds;

    }

    public int getNumberOfCds() {
        return this.numberOfCds;
    }

    

}
