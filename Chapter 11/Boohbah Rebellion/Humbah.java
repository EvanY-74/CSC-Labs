class Humbah extends SupremeBoohbah {
    Humbah() {
        super();
        this.name = "Humbah";
        System.out.println(this.name + " kneels before the Supreme.");
    }

    @Override
    public void command() {
        super.command();
        System.out.println("follows orders without question");
    }
}