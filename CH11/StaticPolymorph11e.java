/* Project 11-e
 *
 * Make a program that uses static
 * polymorphisms
 */
import java.util.Scanner;

public class StaticPolymorph11e {
    public static void main(String[] args) {
        Animorph11e manWolf = new Animorph11e("Joseph");
        manWolf.burp();
        manWolf.burp("ABCDEFGHIJ");
        manWolf.burp("ABCDEFGHIJ", "Blub");
    }
}
