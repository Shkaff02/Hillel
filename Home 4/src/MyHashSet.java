public class MyHashSet implements MySet{

    private MyHashMap map = new MyHashMap();

    //проверяем, есть ли такое значение уже в мапе
    @Override
    public boolean add(Key key) {
        if (map.containsKey(key)) {
            return false;
        } else {
            map.put(key, null);
        }
        return true;
    }

    @Override
    public void remove(Key key) {
        map.remove(key);
    }

    @Override
    public boolean contains(Key key) {
        return map.containsKey(key);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public void clear() {
        map.clear();
    }
}
