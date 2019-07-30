public class Radio extends Component {

    private int frequency;

    public Radio(String make,String model){
        super(make,model);
        frequency = 0;
    }

    public String connect(SoundSystem soundSystem){
        this.connectedTo=soundSystem;
        return soundSystem.getName();
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
