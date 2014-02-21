/* Project 7-7
 *
 * Print the perimeter and area of rectangles
 * with all combinations of height and width
 * from 1 - 10 feet in increments of 1 foot.
 *
 * Print the output in formatted columns
 *
 * Length    Width    Area    Perimeter
 *
 */
public class rectStats77 {
	public static void main(String [] args) {
		int leng, wid, area, perim;
		System.out.println("Length\tWidth\tArea\tPerimeter\n");
		for (leng = 1; leng <=10; leng++) {
			for (wid = 1; wid <=10; wid++) {
				area = wid * leng;
				perim = (2 * wid) + (2 * leng);
				System.out.println(leng + "\t" + wid + "\t" + area + "\t" + perim);
			}
		}
	}
}
