package org.example;

public class Human implements Actions {

    final int maxDistance;
    final int maxHeight;

    public Human(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void jump(int height) {
        if (!(height > maxHeight)) {
            System.out.println("человек прыгнул на расстояние в " + height + " см");
        } else {
            System.out.println("человек не смог прыгнуть");
        }
    }

    @Override
    public void run(int distance) {
        if (!(distance > maxDistance)) {
            System.out.println("человек пробежал расстояние в " + distance + " м");
        } else {
            System.out.println("человек не смог пробежать");
        }
    }
}