
public class temp {
    public static void main(String[] args) {
        int[] arr = {33, 12, 23, 5, 33, 12, 23};
        int index = 0;
        int indexValue = 0;
        int doubleInt = 0;
        int value = arr[index];
        for (int i = 1; i < arr.length; i++) {
            if (value != arr[i]) {
                value = arr[index+1];
            } if (value == arr[i]) {
                value = arr[indexValue++];
                doubleInt++;
            }
        }
        if (doubleInt != 2) {
            System.out.println(value);
        }
    }
}
