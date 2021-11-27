package testSearch;

public class Main {
//    public static boolean isLove(int flower1, int flower2) {
//        if ((flower1 - 2 == 0 & flower2 - 2 != 0) || (flower1 - 2 != 0 & flower2 - 2 == 0)) {
//            return false;
//        }
//            return true;
//    }

    public static void main(String[] args) {
//        boolean love = isLove(8, 7);
//        System.out.println(love);

        int[] arr = {23, 231, 424,3434, 5335};
        int[] arr1 = new int[10];
        Search search = new Search(arr1);
        Search search1 = new Search(arr);
        search.addElm(10);
        search.addElm(12);
        search.addElm(22);
        search.addElm(39);
        search.addElm(44);
        search.addElm(550);
        //search.delete(22);
//        search.addElm(46);
//        search.addElm(123);
//        search.addElm(315);
        //search.addElm(550);
        //System.out.println(search.find(315));
        //search.delete(12);
            search.display();
        /*System.out.println();
        int max;
        int index = 0;
        while (index < arr1.length) {
            max = search.getMax();
            search1.addElm(max);
            index++;
        }*/
        /*System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }*/
        //System.out.println(search.getMax());
        //System.out.println(search.getMax());


    }
}
