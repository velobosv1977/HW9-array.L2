import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //public static int[] generateRandomArray() {

    public static void main(String[] args) {
        System.out.println("Homework 9. Array. Lesson 2");
        System.out.println("");
        //Task 1
        System.out.println("Задача 1. Подсчёт затрат");
        int[] arraySalary = {97876, 73645, 83478, 27987, 38726};
        System.out.println(Arrays.toString(arraySalary));
        int sumSalary = 0;
        for (int sum : arraySalary) {
            sumSalary += sum;
        }
        System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей");
        System.out.println("");
        //Task 2
        System.out.println("Задача 2. Максимальные и минимальные затраты");
        int minExp = arraySalary[0];
        int maxExp = arraySalary[0];
        for (int sum : arraySalary) {
            if (sum < minExp) {
                minExp = sum;
            }
            if (sum > maxExp) {
                maxExp = sum;
            }

        }
        System.out.println("Минимальная сумма трат за неделю составила " +minExp+ " рублей. Максимальная сумма трат за неделю составила " +maxExp+ " рублей");
        //Task 3
        System.out.println("");
        System.out.println("Задача 3. Среднее значение затрат");
        // общая сумма затрат содержится в переменной sumSalary, среднее значение расчитаем из длины массива
        double arrayAverage = (double) sumSalary / arraySalary.length;
        System.out.println("Средняя сумма трат за месяц составила " + arrayAverage + " рублей");
        //Task 4
        System.out.println("");
        System.out.println("Задача 4. Бухгалтерский баг");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println((Arrays.toString(reverseFullName)));
        for (int k = 0; k < reverseFullName.length / 2; k++) {
            char temp = reverseFullName[k];
            reverseFullName[k] = reverseFullName[reverseFullName.length - 1 - k];
            reverseFullName[reverseFullName.length - 1 - k] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));

    }

}
