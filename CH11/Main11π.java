/* Project 11-π -- Main class
 *
 * Make a Mammal superclass, a horse subclass,
 * and a main class to invoke methods in these
 * classes.
 */
import java.util.Scanner;
public class Main11π {
    public static void main(String [] args) {
        Mammal11π bob = new Mammal11π("Bob", "Human", "blab");
        Horse11π charlie = new Horse11π("Charlie");

        charlie.desc();
        charlie.eat();
        charlie.makeNoise();
        System.out.print("\n");
        bob.desc();
        bob.makeNoise();
    }
}
