public abstract class Component {

    private String make;
    private String model;
    protected SoundSystem connectedTo;

    public Component(String make,String model){
        this.make=make;
        this.model=model;
        this.connectedTo=null;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

}
