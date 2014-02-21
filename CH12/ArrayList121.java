
public class ArrayList121 {
    private Object[] arrayList;
    private int logSize;
    public ArrayList121() {
        arrayList = new Object[5];
        logSize = 0;
    }
    public ArrayList121(int length) {
        arrayList = new Object[length];
        logSize = 0;
    }
    public ArrayList121(Object[] initialArrayList) {
        arrayList = new Object[initialArrayList.length];
        for (int ind = 0; ind < arrayList.length; ind++)
            arrayList[ind] = initialArrayList[ind];
        logSize = initialArrayList.length;
    }
    public String toString() {
        String objects = "";
        for (int ind = 0; ind < logSize; ind++)
            objects += ind + ". " + arrayList[ind] + " ";
        return objects;
    }
}
