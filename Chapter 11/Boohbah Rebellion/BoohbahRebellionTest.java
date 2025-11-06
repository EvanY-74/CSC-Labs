public class BoohbahRebellionTest {
    public static void main(String[] args) {
        
        SupremeBoohbah boohbahs[] = {new Humbah(), new Zumbah(), new Jumbah(), new Jingbah()};
        
        System.out.println("\n-- Boohbah Rebellion Begins --");
        for (SupremeBoohbah boohbah : boohbahs) {
            boohbah.command();
        }
        System.out.println("\n-- Overloaded Commands --");
        ((Jumbah) boohbahs[2]).command("proclaims: Dance in perfect unison!");
        ((Jingbah) boohbahs[3]).command("Please, no fighting!", true);
    }
}