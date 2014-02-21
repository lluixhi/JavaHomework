/* Project 11-π - Mammal Class
 */

public class Mammal11π{
    public String name, specie, noise;

    public Mammal11π(String nm, String spc, String noiz) {
        name = nm;
        specie = spc;
        noise = noiz;
    }

    public void makeNoise() {
        System.out.println(noise + " " + noise + " " + noise);
    }

    public void desc() {
        System.out.println(name + " is a " + specie + " who likes to " + noise + " alot ");
    }
}
