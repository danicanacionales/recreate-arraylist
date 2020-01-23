

public class Main {

    public static void main(String[] args) {

        ArrayListV2 arrayListV2 = new ArrayListV2();

        arrayListV2.add("One");
        arrayListV2.add("Two");
        arrayListV2.add("Three");
        arrayListV2.add("Four");
        arrayListV2.add("Five");
        arrayListV2.add("Six");


        arrayListV2.printValues();
        print("Last index of ArrayListV2: " + arrayListV2.getLastIndex());
        print("Size of ArrayListV2: " + arrayListV2.getSize());


        print("Value at index 4: " + arrayListV2.get(4));

        print("Expected to throw an ArrayIndexOutOfBoundsException:");
        print(arrayListV2.get(7));
    }

    public static void print(String string) {
        System.out.println(string);
    }
}
