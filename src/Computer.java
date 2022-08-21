public class Computer {
    private int price;
    private String model;
    Ram ram;
    Hdd hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(int price, String model, String ramName, int ramVolume, String hddName,
                    int hddVolume, String hddType) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
        ram.setName(ramName);
        ram.setVolume(ramVolume);
        hdd.setName(hddName);
        hdd.setVolume(hddVolume);
        hdd.setType(hddType);
    }

    public void printComp() {
        this.price = price;
        this.model = model;
        System.out.println("Price the comp: " + price + "\n" + "Model the comp: " + model + "\n" + "Name of the RAM: "
                + ram.getName() + "\n" + "Volume of the RAM: " + ram.getVolume() + "\n" + "Name of the HDD: "
                + hdd.getName() + "\n" + "Type of the HDD: " + hdd.getType() + "\n" + "Volume of the HDD: "
                + hdd.getVolume());
    }
}
