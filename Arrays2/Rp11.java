package Arrays2;

import java.util.Random;

public class Rp11 {
    /**
     * В заданном массиве определить длину самой большой упорядоченной (по возрастанию или по убыванию)
     * последовательности.
     */
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 23, -12, -55, -66, -78, 1};
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt();
//        }
        int posCount = 0;
        int max = arr[0];
        int negCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                posCount++;
            }
            else if (arr[i] > max) {
                negCount++;
            }
        }
        if (negCount > posCount) {
            System.out.println("neg" + " " + negCount);
        }
        else if (posCount > negCount) {
            System.out.println("pos" + " " + posCount);
        }
    }
}
