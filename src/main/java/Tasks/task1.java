package Tasks;
//1)Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;

public class task1 {
    public LinkedList<Integer> removeLink (){

        int[] listMas = {7, 5, 7, 3, 8};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
    return linkList;
    }

}
