/* DynamicPolymorph11e2
 *
 * Make a program that shows Dynamic 
 * Polymorphisms.
 *
 */

public class DynamicPolymorph11e2 {
    public static void main(String[] args) {
        Cheese11e2 tasty = new Cheese11e2("Zest");
        tasty.slice();
        tasty = new Cheddar11e2("Chees", "apples");
        tasty.slice();
    }
}
