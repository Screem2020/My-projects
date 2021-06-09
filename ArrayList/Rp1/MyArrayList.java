package ArrayList.Rp1;

import java.util.Arrays;

public class MyArrayList {

//    Реализовать свой аналог класса ArrayList с методами add, get, size, contains, indexOf, remove по индексу,
//    remove по значению, который будет хранить только значения в типе Rectangle.
//    Создать класс Rectangle с полями a,b - стороны прямоугольника, переопределить методы equals
//    (два прямоугольника считаются равными, если совпадают их стороны) и toString (возвращает строку, содержащую
//    стороны прямоугольника)


    private Rectangle[] arr = new Rectangle[10];
    private int currentIndex;

    public void add(Rectangle a) {
        for (int i = 0; i < arr.length; i++) {
            if (size() >= arr.length / 2) {
                arr = Arrays.copyOf(arr, arr.length * 3 / 2);
            }
        }
        arr[currentIndex] = a;
        currentIndex++;
    }

    public Rectangle getRectangle(int currentIndex) {
        return arr[currentIndex];
    }

    public int size() {
        return currentIndex;
    }

    public int indexOf(Rectangle a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(a)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Rectangle a) {
        return indexOf(a) != 1;
    }

    public boolean removeIndex(int index) {
        if (index < 0 && index > size()) {
            return false;
        }
        for (int i = index; i < size(); i++) {
            arr[i] = arr[i + 1];
        }
        currentIndex--;
        return true;
    }
    public boolean remove(Rectangle a) {

            for (int i = 0; i < size(); i++) {
                boolean equals = arr[i].equals(a);
                if (equals) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = null;
                    return true;
                }
            }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr);
    }
}
