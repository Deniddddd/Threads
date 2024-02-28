package app;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Vegetable vegetable = new Vegetable();
        vegetable.start();
        try {
            vegetable.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fruit.start();
    }
}
