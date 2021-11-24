package Strings.FixSum;

public class Main {
    public static void main(String[] args) {
        sumVal(args);
    }

    public static void sumVal(String[] arr) {
        int sum1;
        int sumVal = 0;
        for (int i = 1; i < arr.length; i++) {
            sum1 = Integer.parseInt(arr[i]);
            sumVal += sum1;
        }
        System.out.println(sumVal);
    }
}
