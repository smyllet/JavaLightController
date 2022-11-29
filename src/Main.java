import model.Light;
import model.Network;
import model.Objet;

import view.MainMenuWindow;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Light loungeLight = new Light("Lumière salon", "192.168.1.1");
        Light roomLight = new Light("Lumière chambre", "192.168.1.2");
        Light kitchenLight = new Light("Lumière cuisine", "192.168.1.54");

        List<Objet> objets = List.of(loungeLight, roomLight, kitchenLight);
        Network network = new Network(objets);

        MainMenuWindow mainMenuWindow = new MainMenuWindow(network);
        mainMenuWindow.display();
    }
}