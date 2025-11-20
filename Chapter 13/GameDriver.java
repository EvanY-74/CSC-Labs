// Driver for the Enemy inheritance lab
 
public class GameDriver {
 
    public static void main(String[] args) {
 
        // TODO: Add this commented line to show that Enemy cannot be instantiated:
        // Enemy e = new Enemy();
 
        // TODO: Create an Enemy[] array with:
        Enemy[] enemies = {
            new Slime("Green Slime", 20, 5),
            new Skeleton("Skeleton Archer", 30, 10),
            new Dragon("Ancient Dragon", 100, 20)
        };
 
        // TODO: Loop through the array and call:
        for (Enemy enemy : enemies) {
            System.out.println("=== " + enemy.name + " ===");
            enemy.update();
            enemy.attack();
            enemy.takeDamage(5);
            System.out.println();
        }
 
        // TODO: Add reflection answers as comments at the bottom of this file
        // in REFLECTION.md
    }
}