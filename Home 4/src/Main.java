public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(new Key(10), new Value(20));
        map.put(new Key(40), new Value(200));
        map.put(new Key(10), new Value(4302));
        map.remove(new Key(10));

        System.out.println(map.containsKey(new Key(40)));

        System.out.println(map.get(new Key(10)));
        System.out.println(map.get(new Key(40)).getValue());
        System.out.println("Size = " + map.size());
        System.out.println("-----------------------------------");

        /////////////////////////////////////////////////////////

        MyHashSet set = new MyHashSet();
        System.out.println("Can I ad 10? " + set.add(new Key(10)));
        System.out.println("Can I ad 10 again? " + set.add(new Key(10)));
        set.add(new Key(20));

        System.out.println("Set contains key 20? " + set.contains(new Key(20)));
        System.out.println("Is set empty? " + set.isEmpty());
        System.out.println("Clearing");
        set.clear();
        System.out.println("And now? " + set.isEmpty());
    }
}
