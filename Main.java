 public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Obstacle[]{new Cross(80), new Wall(2), new Wall(1), new Cross(120), new Water(100)});
        Team team = new Team("Команда 1", new Player[]{new Player("Игрок 1"), new Player("Игрок 2"), new Player("Игрок 3"), new Player("Игрок 4")} );
        c.go(team);
        team.showResults();
    }
}
