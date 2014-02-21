/* Pie11e3
 *
 * implements Pieinterface
 *
 */
public class Pie11e3 implements PieInterface11e3 {
    private String berries;

    public Pie11e3(String berry) {
        berries = berry;
    }

    public void sliceNeat(String flavor) {
        System.out.println("Wow, this " + berries + " pie tastes like " + flavor);
    }
}
