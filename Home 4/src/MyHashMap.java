import java.util.HashMap;
import java.util.LinkedList;

public class MyHashMap implements MyMap{

    //создаем массив списков для хранения пар "ключ - значение"
    LinkedList<Entry>[] hashMap = new LinkedList[2];
    int size = 0;

    public MyHashMap() {

    }

    @Override
    public void clear() {
        size = 0;
        hashMap = new LinkedList[16];
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Key key) {
        if (key == null) return  false;

        //определяем индекс нахождения в массиве
        int index = getIndex(key) % hashMap.length;

        if (hashMap[index] == null) return false;

        //осуществляем проход по каждому элементу списка определенной ячейки массива для нахождения ключа
        for (Entry entry : hashMap[index]) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Value get(Key key) {
        int index = getIndex(key) % hashMap.length;

        //определяем индекс нахождения в массиве
        if (hashMap[index] == null) return null;

        //осуществляем проход по каждому элементу списка определенной ячейки массива для нахождения ключа
        //и возвращения элемента
        for (Entry entry : hashMap[index]) {
            if (entry.key.equals(key)){
                return entry.value;
            }
        }

        return null;
    }

    @Override
    public void put(Key key, Value value) {

        //если количество пар "ключ - значение" становится больше, чем длина массива
        //задаем ему новый размер
        if (size > hashMap.length) {
            resize();
        }

        //определяем индекс нахождения в массиве
        int index = getIndex(key) % hashMap.length;

        //если ячейка пустая = добавляем новую пару "ключ - значение"
        if (hashMap[index] == null) {
            hashMap[index] = new LinkedList<>();
            hashMap[index].add(new Entry(key, value));

            //увеличиваем количество элементов
            size++;
            return;
        }
        else {
            //проверяем, если пара с таким ключом уже существует, переопределяем ее значение
            for (Entry entry : hashMap[index]) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }
            //если не нашли, добавляем новую пару в список
            hashMap[index].add(new Entry(key, value));
            size++;
            return;
        }
    }

    @Override
    public void remove(Key key) {
        if (key == null) return;

        int index = getIndex(key) % hashMap.length;
        if (hashMap[index] == null) return;

        Entry toRemove = null;

        //ищем пару с нужным ключем
        for (Entry entry : hashMap[index]) {
            if (entry.key.equals(key)){
                toRemove = entry;
                break;
            }
        }

        if (toRemove == null) return;

        //удаляем, если нашли
        hashMap[index].remove(toRemove);
        size--;
    }

    @Override
    public void resize() {
        //создаем массив для временного хранения старого
        LinkedList<Entry>[] oldHashMap = hashMap;
        hashMap = new LinkedList[size * 2];
        size = 0;

        //перезаписываем элементы в массив новой длины
        for (int i = 0; i < oldHashMap.length; i++) {
            if (oldHashMap[i] == null) continue;
            for (Entry entry : oldHashMap[i]) {
                put(entry.key, entry.value);
            }
        }
    }

    @Override
    public int getIndex(Key key) {
        return key.hashCode();
    }

    @Override
    public int size() {
        return size;
    }
}
