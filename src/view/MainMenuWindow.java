package view;
import component.ObjetListElement;
import model.Network;

import javax.swing.*;
import java.awt.*;

public class MainMenuWindow extends JFrame {
    private final Network network;

    public MainMenuWindow(Network network) {
        this.network = network;

        setTitle("Menu principal");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ScrollPane scrollPane = new ScrollPane();
        add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        scrollPane.add(panel);

        network.getObjets().forEach(objet -> panel.add(new ObjetListElement(objet)));
    }

    public void display() {
        setVisible(true);
    }
}
