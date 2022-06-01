package punguin_2;

public class Main2 {
    public static void main(String[] args) {
//        char ch = 9654;
//        System.out.println(ch);
//        int[] arrs = new int[10];
//        System.out.println(ch);
//        Arrays.fill(arrs, ch);
//        System.out.println(Arrays.toString(arrs));
//        Arrays.stream(arrs).forEach(s -> System.out.println((char)s));

        //       *
        //      ***
        //     *****
        //    *******
        //   *********
        //       *
        //       *

        int size = 14;
        String r = "*";
        int[] arr = new int[size];
        int indedY = size;
        for (int i = 0; i < arr.length; i++) {  // высота
            for (int j = 0; j < arr.length; j++) {     // ширина  //TODO: доделать елочку
                if (j <= indedY) {
                    System.out.print(r);
                    indedY--;
                }
//                if (j > indedY - 1) {
//                    System.out.print("*");
               // }
            }
            System.out.println();
        }
    }
}