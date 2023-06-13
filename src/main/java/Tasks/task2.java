package Tasks;

import java.util.LinkedList;
import java.util.Scanner;

//2)Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class task2 {
    public LinkedList getResult(){

        int[] list = {1, 2, 6, 9, 2};

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        System.out.println("Первоначальная очередь равна: " + linkList);
        System.out.println("Ввелите число, которое хотите добавить: ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        enqueue(linkList, n);
        System.out.println("Очередь с новым элементов в конце равна: " + linkList);
        System.out.println("Первый элемент очереди равен: " + dequeue(linkList) + "и он будет удален");
        System.out.println("Обновленная очередь равна: " + linkList);
        System.out.println("Первый элемент из очередт равен: " + first(linkList));
        System.out.println("Окончательный вариант очереди равен: " + linkList);
        return linkList;
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
