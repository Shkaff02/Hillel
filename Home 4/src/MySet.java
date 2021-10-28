public interface MySet {
    boolean add(Key key);
    void remove(Key key);
    boolean contains(Key key);
    int size();
    boolean isEmpty();
    void clear();
}
