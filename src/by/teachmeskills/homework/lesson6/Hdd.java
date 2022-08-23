public class Hdd {
    private String name;
    private int volume;
    private String type;

    public Hdd() {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void HddTwo(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void printHdd() {
        System.out.println(getName() + ", " + getVolume() + ", " + getType());
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
