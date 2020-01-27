public class ArrayListV2 {

    private String[] array;

    private int lastIndex;

    public ArrayListV2 () {
        this.array = new String[1];
        this.lastIndex = 0;
    }

    /**
     * number of items
     */
    public int size() {
        return this.lastIndex;
    }

    /**
     * number of items it can hold
     */
    public int capacity() {
        return this.array.length;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    /**
     * returns item at given index, blows up if index out of bounds
     */
    public String at(int index) {
        if(index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    /**
     * adds item at the end of the list
     */
    public void push(String item) {
        upsize();

        this.array[lastIndex] = item;
        lastIndex++;
    }

    /**
     * can use insert above at index 0
     */
    public void prepend(String item) {
        upsize();

        if(lastIndex == 0) {
            array[lastIndex] = item;
            lastIndex++;
            return;
        }

        for(int i = lastIndex; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = item;
        lastIndex++;
    }

    /**
     * remove from end, return value
     */
    public String pop() {
        String lastElement = array[lastIndex - 1];
        array[lastIndex - 1] = null;

        lastIndex--;
        return lastElement;
    }

    /**
     * looks for value and returns first index with that value, -1 if not found
     */
    public int find(String item) {

        for(int i = 0; i < lastIndex; i++) {
            if(item.equals(array[i])) {
                return i;
            }
        }

        return -1;
    }

    public void printElements() {
        System.out.print("[ ");
        for(int i = 0; i < lastIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    private void upsize() {
        if(lastIndex < capacity()) {
            return;
        }

        String[] newArray = new String[capacity() * 2];

        for(int i = 0; i < size(); i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    private void downsize() {
        
    }
}
