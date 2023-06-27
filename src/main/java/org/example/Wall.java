package org.example;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void use(Actions action) { // передаем конкретное действие (в данном случае прыжок)
        action.jump(height); // прыгаем
    }
}
