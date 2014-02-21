
public class ArrayList122 {
    private Object[] arrayList;
    private int logSize;
    public ArrayList122() {
        arrayList = new Object[5];
        logSize = 0;
    }
    public ArrayList122(int length) {
        arrayList = new Object[length];
        logSize = 0;
    }
    public ArrayList122(Object[] initialArrayList) {
        arrayList = new Object[initialArrayList.length];
        for (int ind = 0; ind < arrayList.length; ind++)
            arrayList[ind] = initialArrayList[ind];
        logSize = initialArrayList.length;
    }
    public Object get(int ind) {
        if (ind < 0 || ind >= arrayList.length)
            throw new IndexOutOfBoundsException("Index" + ind + "is out of bounds!");
        else return arrayList[ind];
    }
    public int size() {
        return logSize;
    }
    public String toString() {
        String objects = "";
        for (int ind = 0; ind < logSize; ind++)
            objects += ind + ". " + arrayList[ind] + " ";
        return objects;
    }
}
