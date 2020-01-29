

public class Main {

    public static void main(String[] args) {

        ArrayListV2 arrayListV2 = new ArrayListV2();

        print("Array size: " + arrayListV2.size());

        arrayListV2.push("A");
        arrayListV2.push("B");
        arrayListV2.push("C");
        arrayListV2.push("D");
        arrayListV2.push("E");
        arrayListV2.push("F");
        arrayListV2.push("G");

        arrayListV2.printElements();
        arrayListV2.printArray();
        print("Array capacity: " + arrayListV2.capacity());
        System.out.println("Array size: " + arrayListV2.size());

        arrayListV2.insert(3, "X");
        arrayListV2.printElements();

        System.out.println("Find A: " + arrayListV2.find("A"));
        System.out.println("Find X: " + arrayListV2.find("X"));
        print("Array capacity: " + arrayListV2.capacity());
        System.out.println("Array size: " + arrayListV2.size());
    }

    public static void print(String string) {
        System.out.println(string);
    }
}
