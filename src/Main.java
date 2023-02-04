import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(444);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println();

        ArrayListImplementation list = new ArrayListImplementation(10);
        list.add(2); //0
        list.add(4); //1
        list.add(6); //2
        list.add(8); //3
        list.add(10); //4
        list.add(444); //5

        System.out.println(list);
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());

    }
}
