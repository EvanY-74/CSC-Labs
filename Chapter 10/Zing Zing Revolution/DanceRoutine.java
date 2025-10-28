// import Java.utils.StringBuilder;

public class DanceRoutine {
    private Boohbah[] boohbahs;

    DanceRoutine(Boohbah[] boohbahs) {
        this.boohbahs = boohbahs;
    }

    public String buildRoutine() {
        StringBuilder routine = new StringBuilder();
        for (Boohbah boohbah : this.boohbahs) {
            routine.append(boohbah.performMove() + '\n');
        }
        return routine.toString();
    }

    public String modifyRoutine() {
        return this.buildRoutine().replace("performs", "dances to");
    }
}