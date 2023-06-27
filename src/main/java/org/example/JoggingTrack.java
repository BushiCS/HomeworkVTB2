package org.example;

public class JoggingTrack implements Obstacle {

    private final int distance;

    public JoggingTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void use(Actions action) { // передаем в использование конкретное действие (в данном случае бег)
        action.run(distance); // бежим
    }
}
