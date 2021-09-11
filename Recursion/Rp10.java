package Recursion;

public class Rp10 {
    /**
     * Написать метод, который будет принимать в качестве параметра массив типа String и сроку, которую метод будет рекурсивно искать в массиве
     * (вы можете добавлять дополнительные параметры методу). Если данная строка есть в массиве, метод должен вернуть true, иначе - false.
     * В методе запрещено использовать циклы.Можно сделать задачу более сложным путем: сделайте так,
     * чтобы метод мог принимать массив в любом типе данных и искать в этом массиве значение также в любом типе данных, а не только в виде строки.
     */
    public static void main(String[] args) {
        String[] strings = {"строка1", "строка2", "строка3"};
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i] + " ");
//        }
        System.out.println(rec(strings, "строка", 0));
    }

    public static boolean rec(String[] arr, String a, int index) {
        if (index < arr.length) {
            if (arr[index].equalsIgnoreCase(a)) {
                return true;
            }
            rec(arr, a, index + 1);
        return true;
        } else {
            return false;
        }
    }
}
