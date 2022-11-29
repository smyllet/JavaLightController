package component;

import model.Light;

import javax.swing.*;
import java.awt.*;
import java.util.function.Function;

public class RGBControlPanel extends JPanel {
    private final JSlider redSlider;
    private final JSlider greenSlider;
    private final JSlider blueSlider;

    public RGBControlPanel(Light light, Function<Color, Void> onColorChange) {
        this.redSlider = new JSlider(0, 255, light.getColor().getRed());
        this.greenSlider = new JSlider(0, 255, light.getColor().getGreen());
        this.blueSlider = new JSlider(0, 255, light.getColor().getBlue());

        setLayout(new GridLayout(3, 2));

        // Slider for red
        add(new JLabel("Rouge"));
        add(redSlider);
        redSlider.addChangeListener(e -> onColorChange.apply(getSlidersColor()));

        // Slider for green
        add(new JLabel("Vert"));
        add(greenSlider);
        greenSlider.addChangeListener(e -> onColorChange.apply(getSlidersColor()));

        // Slider for blue
        add(new JLabel("Bleu"));
        add(blueSlider);
        blueSlider.addChangeListener(e -> onColorChange.apply(getSlidersColor()));
    }

    public Color getSlidersColor() {
        return new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue());
    }
}
