package behavioral.iterator;

public interface Iter<T> {

    public boolean hasNext();
    public T currentItem();
    public void next();
    public void reset();
}
