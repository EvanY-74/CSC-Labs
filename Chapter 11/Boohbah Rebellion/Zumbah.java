class Zumbah extends SupremeBoohbah {
    Zumbah() {
        super();
        this.name = "Zumbah";
        System.out.println(this.name + " pretends to obey but plots quietly.");
    }

    @Override
    public void command() {
        super.command();
        System.out.println("mimics obedience but starts a secret dance party!");
    }
}