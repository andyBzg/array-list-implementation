public class Main {
    public static void main(String[] args) {

        ArrayListImplementation list = new ArrayListImplementation(10);
        list.add(2); //0
        list.add(4); //1
        list.add(6); //2
        list.add(888); //3
        list.add(10); //4
        list.add(444); //5

        System.out.println(list);
        System.out.println("size " + list.size());

        list.remove(3);
        System.out.println(list);
        System.out.println("size " + list.size());

        list.add(1, 555);
        System.out.println(list);
        System.out.println("size " + list.size());

    }
}
