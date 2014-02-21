public class ArrayList123 {
    private Object[] arrayList;
    private int logSize;
    private IndexOutOfBoundsException exceptInd = new IndexOutOfBoundsException("Index is out of bounds!");
    public ArrayList123() {
        arrayList = new Object[5];
        logSize = 0;
    }
    public ArrayList123(int length) {
        arrayList = new Object[length];
        logSize = 0;
    }
    public ArrayList123(Object[] initialArrayList) {
        arrayList = new Object[initialArrayList.length];
        for (int ind = 0; ind < arrayList.length; ind++)
            arrayList[ind] = initialArrayList[ind];
        logSize = initialArrayList.length;
    }
    public boolean add(int pos, Object obj) {
        if (logSize == arrayList.length)
            return false;
        else {
            if (pos <= 0)
                pos = 0;
            else if (pos >= arrayList.length)
                pos = arrayList.length - 1;
            Object temp = obj, temp2;
            for (int ind = pos; ind < arrayList.length; ind++) {
                temp2 = arrayList[ind];
                arrayList[ind] = temp;
                temp = temp2;
            }
            return true;
        }
    }
    public Object get(int ind) {
        if (ind < 0 || ind >= arrayList.length)
            throw exceptInd;
        else return arrayList[ind];
    }
    public int size() {
        return logSize;
    }
    public Object remove(int pos) {
        if (pos < 0 || pos >= arrayList.length)
            throw exceptInd;
        else {
            Object obj = arrayList[pos];
            for (int ind = pos; ind < arrayList.length - 1; ind++)
                arrayList[ind] = arrayList[ind + 1];
            logSize--;
            return obj;
        }
    }
    public String toString() {
        String objects = "";
        for (int ind = 0; ind < logSize; ind++)
            objects += ind + ". " + arrayList[ind] + " ";
        return objects;
    }
}
