package Hash_Table;

/**
 * Created by Nick on 3/27/17.
 */
public class LinkedHashEntry {
    private int key;
    private int value;
    private LinkedHashEntry next;

    LinkedHashEntry(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public LinkedHashEntry getNext() {
        return next;
    }

    public void setNext(LinkedHashEntry next) {
        this.next = next;
    }
}
