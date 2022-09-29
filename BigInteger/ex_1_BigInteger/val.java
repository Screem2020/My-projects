package BigInteger.ex_1_BigInteger;

public class val {
    public static void main(String[] args) {
        //int a = (int)(Math.random() * 2) - 2;
        int[] arr2 = {1,0,0};
        int[] arr1 = {1,0};
        boolean flag = false;
        for (int i = arr1.length - 1; i != 0; --i) {
            if (arr1[i] + arr2[i] > 9) {
                arr1[i] = arr1[i] - 10;
                arr2[i] = arr1[i] + arr2[i];
                System.out.print(arr1[i] + " ");
            } else {
                arr2[i] = arr2[i] + arr1[i];
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
