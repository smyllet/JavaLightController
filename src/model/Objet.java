package model;

public class Objet {
    private String name;
    private final String addressIp;
    protected boolean stat;

    public Objet(String name, String addressIp) {
        this.name = name;
        this.addressIp = addressIp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressIp() {
        return addressIp;
    }

    public boolean getStat() {
        return stat;
    }

    public void turnOn() {
        stat = true;
    }

    public void turnOff() {
        stat = false;
    }
}
