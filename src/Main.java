import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToyMenu toyMenu = new ToyMenu();
        Prize prizeManager = new Prize();

        autoRefillPrizes(toyMenu);

        int numberOfPrizes = 7;
        List<Toy> drawnToys = new ArrayList<>();

        for (int i = 0; i < numberOfPrizes; i++) {
            Toy prize = toyMenu.drawToy();

            if (prize != null) {
                prizeManager.addPrizeToQueue(prize);
                drawnToys.add(prize);
            }
        }

        prizeManager.writeToFile(drawnToys);

        for (int i = 0; i < numberOfPrizes; i++) {
            prizeManager.getPrize();
        }
    }

    private static void autoRefillPrizes(ToyMenu toyManager) {
        toyManager.addNewToy(1, "Teddy Bear", 10, 20.0);
        toyManager.addNewToy(2, "Doll", 15, 15.0);
        toyManager.addNewToy(3, "Car", 20, 25.0);
        toyManager.addNewToy(4, "Dinosaur", 8, 22.0);
        toyManager.addNewToy(5, "Robot", 12, 18.0);
        toyManager.addNewToy(6, "Train", 15, 21.0);
    }
}
