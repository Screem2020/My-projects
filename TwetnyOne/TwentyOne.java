package TwetnyOne;

import java.util.Scanner;

public class TwentyOne {
    /**
     * 1. Реализовать игру в 21. Программа генерирует случайное число в диапазоне от 1 до 11 включительно.
     * Задача набрать сумму очков, максимально близкое к числу 21. Побеждает тот игрок, у кого сумма очков ближе к числу 21.
     * Если сумма очков превышает число 21. это автоматический пройгрыш.
     * Создать консольное меню:
     * 1. Добавить очки первому игроку (сгенерированное число добавляется к сумме очков первого игрока.
     * На консоль выводится сгенерированное число и общая сумма очков. Если получилось больше 21, игрок проиграл)
     * 2. Добавить очки второму игроку (сгенерированное число добавляется к сумме очков второго игрока.
     * На консоль выводится сгенерированное число и общая сумма очков. Если получилось больше 21, игрок проиграл)
     * 3. Определить победителя
     * 4. Выход
     * <p>
     * 2. Реализовать игру камень-ножницы-бумага.
     * Создать консольное меню:
     * 1. Ход первого игрока
     * 2. Ход второго игрока
     * 3. Выход
     * <p>
     * При выборе п.1 программа генерирует один из трех исходов (камень, ножницы или бумагу) для первого игрока  и выводит его на консоль.
     * При выборе п.2 программа генерирует один из трех исходов для второго игрока, выводит его на консоль и сразу определяет победителя.
     * Генерировать исход события можно с помощью случайных чисел или путем ввода пользователем с консоли.
     * <p>
     * Усложнение игры:
     * - Добавить в игру возможность играть до трех очков (победителем является тот, кто первый наберет три очка).
     * В итоге консольное меню должно выглядеть так:
     * 1. Ход первого игрока
     * 2. Ход второго игрока
     * 3. Играть до трех очков
     * 4. Выход
     * <p>
     * Если объединить два режима в одном меню сложно, просто сделайте усложненный вариант в виде отдельной программы.
     */
    public static void main(String[] args) {
        int input = 0;
        int indexStepOne = 0;
        int indexStepTwo = 0;
        int ceil = 0;
        int pointsOnePlayer = 0;
        int pointsTwoPlayer = 0;
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println("" +
                    "       1. Добавить очки первому игроку \n" +
                    "       2. Добавить очки второму игроку \n" +
                    "       3. Определить победителя\n" +
                    "       4. Выход");
            input = scn.nextInt();

            switch (input) {
                case 1: {
                    if (indexStepOne < 3) {
                        ceil = (int) (Math.random() * 12);
                        pointsOnePlayer += ceil;
                        if (pointsOnePlayer <= 21) {
                            System.out.println(pointsOnePlayer);
                        } else {
                            System.out.println("Проигрыш " + pointsOnePlayer + " очков");
                            System.out.println("Победитель игрок 2 => " + pointsOnePlayer + " очков");
                            return;
                        }
                    } else System.out.println("Ходов больше нет. " + "У вас " + pointsOnePlayer + " очков");
                    indexStepOne++;
                    break;
                }
                case 2: {
                    if (indexStepTwo < 3) {
                        ceil = (int) (Math.random() * 12);
                        pointsTwoPlayer += ceil;
                        if (pointsTwoPlayer <= 21) {
                            System.out.println(pointsTwoPlayer);
                        } else {
                            System.out.println("Проигрыш " + pointsTwoPlayer + " очков");
                            System.out.println("Победитель игрок 1 => " + pointsOnePlayer + " очков");
                            return;
                        }
                    } else System.out.println("Ходов больше нет. " + "У вас " + pointsTwoPlayer + " очков");
                    indexStepTwo++;
                    break;
                }

                case 3: {
                    if (pointsTwoPlayer > pointsOnePlayer) {
                        System.out.println("Победитель игрок 2 => " + pointsTwoPlayer + " очков");
                    }
                    else if (pointsOnePlayer > pointsTwoPlayer) {
                        System.out.println("Победитель игрок 1 => " + pointsOnePlayer + " очков");
                    } else {
                        System.out.println("Ничья");
                    }
                    break;
                }
            }
        }
    }
}
