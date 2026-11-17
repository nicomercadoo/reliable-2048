package ar.edu.unrc.sortedList;

public class SortedList {

    private int elem;
    private SortedList next;
    private static final int SENTINEL = Integer.MAX_VALUE;

    public SortedList() {
        this(SENTINEL, null);
    }

    private SortedList(int elem, SortedList next) {
        this.elem = elem;
        this.next = next;
    }

    void insert(int data) {
        if (data > elem) {
            next.insert(data);
        } else {
            next = new SortedList(elem, next);
            elem = data;
        }
    }

    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    public SortedList getNext() {
        return next;
    }

    public void setNext(SortedList next) {
        this.next = next;
    }

    public static int getSentinel() {
        return SENTINEL;
    }

    @Override
    public String toString() {
        String result = "[";
        SortedList curr = this;
        while (curr.next != null) {
            result += curr.elem;
            if (curr.next.next != null) {
                result += ", ";
            }
            curr = curr.next;
        }
        return result + "]";
    }
}
