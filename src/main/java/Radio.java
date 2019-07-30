public class Radio extends Component {

    public Radio(String make,String model){
        super(make,model);
    }

    public String connect(SoundSystem soundSystem){
        this.connectedTo=soundSystem;
        return soundSystem.getName();
    }
}
