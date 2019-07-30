public class SoundSystem {

    private String name;
    private int volume;

    public SoundSystem(String name) {
        this.name = name;
        this.volume = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void raiseVolume () {
        if (volume<9)
        this.volume +=1;
    }


    public void lowerVolume () {
        if (volume>0)
        this.volume -=1;
    }

    public String tuneRadio(Radio radio,int frequency){
        radio.setFrequency(frequency);
        return "connected to "+radio.getFrequency()+"! yay!";
    }


}
