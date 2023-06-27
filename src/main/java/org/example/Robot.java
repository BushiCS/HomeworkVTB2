package org.example;

public class Robot implements Actions {
    final int maxDistance;
    final int maxHeight;

    public Robot(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void jump(int height) {
        if (!(height > maxHeight)) {
            System.out.println("робот прыгнул на расстояние в " + height + " см");
        } else {
            System.out.println("робот не смог прыгнуть");
        }
    }

    @Override
    public void run(int distance) {
        if (!(distance > maxDistance)) {

            System.out.println("робот пробежал расстояние в " + distance + " м");
        } else {
            System.out.println("робот не смог пробежать");
        }
    }
}
