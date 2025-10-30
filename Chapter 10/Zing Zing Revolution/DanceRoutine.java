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

    public String remixRoutine() {
        StringBuilder builtRoutine = new StringBuilder(this.buildRoutine());
        builtRoutine.insert(0, "--- REMIX ---\n");
        builtRoutine.deleteCharAt(builtRoutine.length() - 1);
        // builtRoutine.delete(builtRoutine.length() - 1, builtRoutine.length());
        builtRoutine.append("\n(Backwards Boohbah Shuffle!)");
        builtRoutine.reverse();
        return builtRoutine.toString();
    }
}