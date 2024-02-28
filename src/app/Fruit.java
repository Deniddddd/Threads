package app;
import java.util.Arrays;
import java.util.List;
class Fruit extends Thread {
    private List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Mango");

    @Override
    public void run() {
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

