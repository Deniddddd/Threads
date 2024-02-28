package app;
import java.util.List;
import java.util.Arrays;

class Vegetable extends Thread {
    private List<String> vegetables = Arrays.asList("Carrot", "Tomato", "Broccoli", "Spinach", "Potato");

    @Override
    public void run() {
        for (String vegetable : vegetables) {
            System.out.println("Vegetable: " + vegetable);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
