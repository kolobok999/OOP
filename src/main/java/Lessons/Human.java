package Lessons;

public class Human implements Speakable, Runnable {
    private int speed;

    @Override
    public void run(int speed) {
        System.out.printf("Я бегу со скоростью %d", speed);
    }

    @Override
    public void speak() {
        System.out.println("О... Я могу много чего сказать");
    }

}
