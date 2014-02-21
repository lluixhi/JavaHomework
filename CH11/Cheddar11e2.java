/* Cheddar11e2
 *
 * Yum. Cheddar.
 *
 */

public class Cheddar11e2 extends Cheese11e2 {
    private String smell;

    public Cheddar11e2(String tst, String sml) {
        super(tst);
        smell = sml;
    }

    public void slice() {
        System.out.println("\nYou breathe in the smell of freshly cut cheese.\nIt smells like " + smell);
        System.out.println("You love the smell of freshly cut cheese in the morning.\nYou can feel the smell permeate your tastebuds.");
        System.out.println("Yum.\n" + getTaste() + "y.");
    }
}
