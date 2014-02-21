/* Cheese11e2
 *
 * Mmmm. Cheese.
 *
 */
public class Cheese11e2 {
    private String taste;

    public Cheese11e2(String tst) {
        taste = tst;
    }

    public void slice() {
        System.out.println("You cut the cheese.\nYou eat a slice.\nIt is " + taste + "y.");
    }

    public String getTaste() {
        return taste;
    }
}
