/* Animorph11e
 *
 * Provides the class with
 * static polymorphisms.
 *
 */

public class Animorph11e {
    private String name;

    public Animorph11e(String nm) {
        name = nm;
    }
    public void burp() {
        System.out.println("BRAAAAP");
    }
    public void burp(String thing) {
        System.out.println("BRAAAAP" + thing + "BRAAP");
    }
    public void burp(String thing, String words) {
        System.out.println("BRAAAP" + thing + "BRAAAAP" + words + "BRAP");
    }
}
