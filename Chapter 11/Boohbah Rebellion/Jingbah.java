class Jingbah extends SupremeBoohbah {
    Jingbah() {
        super();
        this.name = "Jingbah";
        System.out.println(this.name + " seeks harmony between Supreme and Rebels.");
    }

    @Override
    public void command() {
        super.command();
        System.out.println("says: Let's all take a deep breath.");
    }

    public void command(String message, boolean whisper) {
        super.command();
        if (whisper) {
            System.out.println("whispers: " + message.toLowerCase());
        } else {
            System.out.println("shouts: " + message.toUpperCase());
        }
    }
}