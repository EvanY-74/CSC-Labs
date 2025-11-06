class Jumbah extends SupremeBoohbah {
    Jumbah() {
        super();
        this.name = "Jumbah";
        System.out.println(this.name + " refuses to kneel!");
    }

    @Override
    public void command() {
        super.command();
        System.out.println("shouts: No more orders!");
    }

    public void command(String message) {
        super.command();
        System.out.println(message);
    }
}