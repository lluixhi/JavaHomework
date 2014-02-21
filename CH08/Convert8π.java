/* Project 8-π -- Convert class
 *
 * Handles the actual conversions
 *
 */
public class Convert8π {
	double meters;

	public Convert8π() {
		meters = 0;
	}

	public void setMeters(double len) {
		meters = len;
	}

	public void setMiles(double len) {
		meters = len * 1609.344;
	}

	public void setkMeters(double len) {
		meters = len * 1000;
	}

	public double getMeters() {
		return meters;
	}

	public double getkMeters() {
		return meters/1000;
	}

	public double getMiles() {
		return meters/1609.344;
	}
}
