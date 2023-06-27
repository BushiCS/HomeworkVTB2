package org.example;

public class Main {
    public static void main(String[] args) {

        Actions[] entrants = {
                new Cat(1500, 100),
                new Human(2000, 200),
                new Robot(3000, 300)};

        Obstacle[] obstacles = {
                new Wall(300),
                new JoggingTrack(1000)};

        for (Actions entrant : entrants) { // выбираем участника из списка участников (прогоняем всех участников)
            for (Obstacle obstacle : obstacles) { // выбираем препятствие из списка препятствий (прогоняем все препятствия)
                obstacle.use(entrant); // использование препятствия конкретным участником
            }
        }
    }
}