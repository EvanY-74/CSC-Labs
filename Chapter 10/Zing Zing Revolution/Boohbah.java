public class Boohbah {
    private String name, danceMove;

    Boohbah(String name, String danceMove) {
        this.name = name;
        this.danceMove = danceMove;
    }

    public String getName() {
        return this.name;
    }

    public String getDanceMove() {
        return this.danceMove;
    }

    public String performMove() {
        return this.name + " performs " + this.danceMove;
    }
}
