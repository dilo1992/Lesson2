public class Ram {
    private String name;
    private int volume;

    public Ram() {
        this.name = name;
        this.volume = volume;
    }

    public void Ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void printHdd() {
        System.out.println(getName() + ", " + getVolume());
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

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
