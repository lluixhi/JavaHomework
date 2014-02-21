/* Project 11-π -- Horse Class
 */

public class Horse11π extends Mammal11π {
    public Horse11π(String nm) {
        super(nm, "Horse", "Neigh");
    }

    public void eat() {
        System.out.println(name + " bends his neck to eat some grass.");
    }
}
