import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyMenu {
    private List<Toy> toys;

    public ToyMenu() {
        toys = new ArrayList<>();
    }

    public void addNewToy(int toy_id, String name, int quantity, double weight) {
        Toy newToy = new Toy(toy_id, name, quantity, weight);
        toys.add(newToy);
    }

    public void updateWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(newWeight);
                break;
            }
        }
    }

    public Toy drawToy() {
        Random random = new Random();
        double randomValue = random.nextDouble() * 100;
        double sumWeight = 0;
        for (Toy toy : toys) {
            sumWeight += toy.getWeight();
            if (randomValue <= sumWeight && toy.getQuantity() > 0) {
                toy.decreaseQuantity();
                return toy;
            }
        }
        return null;
    }
}

