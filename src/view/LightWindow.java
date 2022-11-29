package view;

import component.RGBControlPanel;
import model.Light;

import javax.swing.*;

public class LightWindow extends JFrame {
    private final Light light;

    public LightWindow(Light light) {
        this.light = light;

        // Paramètre de la fenêtre
        setTitle("Modifier : " + light.getName());
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Ajout du panneau global
        JPanel panel = new JPanel();
        panel.setBackground(light.getColor());
        add(panel);

        // Contrôle du RGB
        RGBControlPanel rgbControlPanel = new RGBControlPanel(light, (color) -> {
            panel.setBackground(color);
            light.setColor(color);
            return null;
        });
        panel.add(rgbControlPanel);

        // Bouton pour quitter
        JButton homeButton = new JButton("Quitter");
        homeButton.addActionListener(e -> dispose());
        panel.add(homeButton);
    }

    public void display() {
        setVisible(true);
    }
}
