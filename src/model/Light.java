package model;

import java.awt.*;

public class Light extends Objet {
    private Color color;
    private int brightness;

    public Light(String name, String addressIp) {
        this(name, addressIp, new Color(0,0, 0), 0);
    }
    public Light(String name, String addressIp, Color color, int brightness) {
        super(name, addressIp);
        setBrightness(brightness);
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setRGB(int rouge, int vert, int bleu) {
        this.color = new Color(rouge, vert, bleu);
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        super.stat = (brightness > 0);
    }

    public int getBrightness() {
        return brightness;
    }
}
