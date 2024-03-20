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
        //������ �������� �� ������ �������
            if (arr.isEmpty()) {
                throw new IndexOutOfBoundsException("������ ������");
            }
        // �������� �� ����������� ���-�� ��������� ��� ����.��������
            else if (arr.size() % 2 == 0) {
                printList(arrNumbers, choice);
            } else {
                System.out.println("���-�� ��������� ������ ���� ������ ��� �������� ���������");
            }

        }


    private static void printList(List<Integer> arr, int choice) {
        LinkedList<Integer> sublist = new LinkedList<>();
        for (int i = 0; i < choice; i++) {
            sublist.add(arr.get(i));
            }
        //������� ��.����. ������ ���� �����
        double averge = calculateAverage(sublist);
        System.out.println(averge);
        //������� ���������
        for (int i = choice; i < arr.size(); i++) {
            sublist.add(arr.get(i));
            sublist.remove();
            double subAverge = calculateAverage(sublist);
            System.out.println(subAverge);
        }
    }
    //������ ����� ������������
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


