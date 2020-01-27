

public class Main {

    public static void main(String[] args) {

        ArrayListV2 arrayListV2 = new ArrayListV2();

        print("Array size: " + arrayListV2.size());

        arrayListV2.push("Z");
        arrayListV2.prepend("A");
        arrayListV2.prepend("B");
        arrayListV2.push("Y");
        arrayListV2.prepend("C");
        arrayListV2.prepend("D");
        arrayListV2.prepend("E");

        System.out.println(arrayListV2.pop());


        arrayListV2.printElements();

        System.out.println("Find A: " + arrayListV2.find("A"));
        System.out.println("Find X: " + arrayListV2.find("X"));
        print("Array size: " + arrayListV2.capacity());
    }

    public static void print(String string) {
        System.out.println(string);
    }
}
