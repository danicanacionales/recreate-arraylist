public class ArrayListV2 {

    private String[] array;

    private int lastIndex;

    /**
     * Creates a new dynamic array with size of 1
     */
    public ArrayListV2 () {
        this.array = new String[1];
        this.lastIndex = 0;
    }

    /**
     *
     * @param value
     */
    public void add(String value) {
        if(lastIndex >= getSize()) {
            resize();
        }

        this.array[lastIndex] = value;
        lastIndex++;
    }

    public String get(int index) {

        if(index > getLastIndex() - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return this.array[index - 1];
    }

    private void resize() {
        String[] newArray = new String[getSize() * 2];

        for(int i = 0; i < getSize(); i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }

    public void printValues() {

        if(getSize() == 0) {
            System.out.println("ArrayListV2 is empty!");
        } else {
            System.out.print("[ ");

            for(int i = 0; i < lastIndex; i++) {
                System.out.print(this.array[i] + " ");
            }

            System.out.println("]");
        }
    }


    public int getLastIndex() {
        return this.lastIndex;
    }

    public int getSize() {
        return this.array.length;
    }
}
