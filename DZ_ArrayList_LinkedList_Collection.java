package DZ_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class DZ_ArrayList_LinkedList_Collection {
    static int choice = 2;
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4);
        List<Integer> arrNumbers = new ArrayList<>(arr);
        //Делаем проверку на список массива
            if (arr.isEmpty()) {
                throw new IndexOutOfBoundsException("Массив пустой");
            }
        // Проверка на достаточное кол-во элементов для сред.значения
            else if (arr.size() % 2 == 0) {
                printList(arrNumbers, choice);
            } else {
                System.out.println("Кол-во элементов должно быть чётное для подсчёта элементов");
            }

        }


    private static void printList(List<Integer> arr, int choice) {
        LinkedList<Integer> sublist = new LinkedList<>();
        for (int i = 0; i < choice; i++) {
            sublist.add(arr.get(i));
            }
        //Считаем ср.знач. первых двух чисел
        double averge = calculateAverage(sublist);
        System.out.println(averge);
        //Считаем остальные
        for (int i = choice; i < arr.size(); i++) {
            sublist.add(arr.get(i));
            sublist.remove();
            double subAverge = calculateAverage(sublist);
            System.out.println(subAverge);
        }
    }
    //Создаём метод Калькулятора
    private static double calculateAverage(List<Integer> arr) {
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            sum += num;
            count++;
        }
        return (double) sum / count;
    }
}


