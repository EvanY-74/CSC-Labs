public class BoohbahDanceTest {
    public static void main(String[] args) {
        // asked copilot and said to replace [...] with new Boohbah[] {...} for array literals
        DanceRoutine danceRoutine = new DanceRoutine(new Boohbah[] {
            new Boohbah("Zing Zing Zingbah", "Spin and Sparkle"),
            new Boohbah("Humbah", "Wiggle Wiggle"),
            new Boohbah("Jumbah", "Twirl of Joy")
        });

        System.out.println("Original Routine:");
        System.out.println(danceRoutine.buildRoutine());
        System.out.println("Modified Routine:");
        System.out.println(danceRoutine.modifyRoutine());
        System.out.println("Remixed Routine:");
        System.out.println(danceRoutine.remixRoutine());
    }
}