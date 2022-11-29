package component;

import model.Objet;
import view.LightWindow;

import javax.swing.*;

public class ObjetListElement extends JPanel {
    public ObjetListElement(Objet objet) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new JLabel(objet.getName()));
        add(new JLabel(" (" + objet.getAddressIp() + ")"));

        add(Box.createHorizontalGlue());

        switch (objet.getClass().getSimpleName()) {
            case "Light":
                JButton button = new JButton("Modifier");
                button.addActionListener(e -> {
                    LightWindow lightWindow = new LightWindow((model.Light) objet);
                    lightWindow.display();
                });
                add(button);
                break;
        }
    }
}
