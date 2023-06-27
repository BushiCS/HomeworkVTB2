package org.example;

public class Cat implements Actions {
    final int maxDistance;
    final int maxHeight;

    public Cat(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void jump(int height) {
        if (!(height > maxHeight)) {
            System.out.println("кот прыгнул на расстояние в " + height + " см");
        } else {
            System.out.println("кот не смог прыгнуть");
        }
    }

    @Override
    public void run(int distance) {
        if (!(distance > maxDistance)) {
            System.out.println("кот пробежал расстояние в " + distance + " м");
        } else {
            System.out.println("кот не смог пробежать");
        }
    }
}
