import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Prize {
    private List<Toy> prizeQueue;

    public Prize() {
        prizeQueue = new ArrayList<>();
    }

    public void addPrizeToQueue(Toy prize) {
        prizeQueue.add(prize);
        prize.decreaseQuantity();
    }

    public Toy getPrize() {
        if (!prizeQueue.isEmpty()) {
            Toy prizeToy = prizeQueue.remove(0);
            //writeToFile(prizeToy);
            System.out.println("Congratulations! Your prize: " + prizeToy.getName());
            return prizeToy;
        } else {
            System.out.println("No prizes available. Try drawing first.");
            return null;
        }
    }

    public void writeToFile(List<Toy> toys) {
        try (FileWriter writer = new FileWriter("prize_list.txt", true)) {
            writer.write("========== Start of New Run ==========\n");
            for (Toy toy : toys) {
                writer.write("ID: " + toy.getId() + ", Name: " + toy.getName() + "\n");
            }
            writer.write("========== End of Run ==========\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

