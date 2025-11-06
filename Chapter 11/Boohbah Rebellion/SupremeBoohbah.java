class SupremeBoohbah {
    protected String name;
    SupremeBoohbah() {
        this.name = "Zing Zing Zingbah";
        System.out.println("SupremeBoohbah awakens! All must obey Zing Zing Zingbah!");
    }

    public void command() {
        System.out.print("COMMAND: " + this.name + " ");
    }

    @Override
    public String toString() {
        return "I am " + this.name;
    }
}