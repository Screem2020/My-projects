package ArrayList.Rp1r;

import java.util.Arrays;

public class List1 {
    /**
     * 1. Реализовать свой аналог класса ArrayList с методами add, get, size, contains, indexOf, remove по индексу,
     * remove по значению, который будет хранить только значения в типе Rectangle.
     * Создать класс Rectangle с полями a,b - стороны прямоугольника, переопределить методы equals
     * (два прямоугольника считаются равными, если совпадают их стороны) и toString
     * (возвращает строку, содержащую стороны прямоугольника)
     */
    private Rectangle[] arr = new Rectangle[10];
    private int currentIndex;

    public void add(Rectangle a) {
        if (size() >= arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 3 / 2);
        }
        arr[currentIndex] = a;
        currentIndex++;
    }

    public Rectangle getCurrentIndex(int index) {
        return this.arr[currentIndex];
    }

    public int size() {
        return this.currentIndex;
    }

    public int indexOf(Rectangle a) {
        for (int i = 0; i < size(); i++) {
            if (this.arr[i].equals(a))
                return i;
        }
        return -1;
    }

    public boolean contains(Rectangle a) {
        return indexOf(a) != -1;
    }

    public boolean removeIndex(int index) {
        if (index < 0 && index >= size()) {
            return false;
        }
            for (int i = 0; i < size(); i++) {
                arr[i] = arr[i + 1];
            }
        currentIndex--;
        return true;
    }

    public boolean remove(Rectangle a) {
        if (a == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            boolean equals = arr[i].equals(a);
            if (equals){
                arr[i] = arr[i + 1];
                return true;
            }
        }
        currentIndex--;
        return false;
    }

    @Override
    public String toString() {
        return "List1{" +
                "arr=" + Arrays.toString(arr);
    }
}
