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

    public void insert(int index, String value) {
        if(index > lastIndex || index < 0) {
             return;
        }

        upsize();

        int currentIndex = lastIndex;
        int valueIndex = lastIndex - 1;

        while(currentIndex > index) {
            array[currentIndex] = array[valueIndex];
            currentIndex--;
            valueIndex--;
        }

        array[index] = value;
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
        if(lastIndex <= 0) {
            return "Array is empty";
        }

        String lastElement = array[lastIndex - 1];
        array[lastIndex - 1] = null;

        lastIndex--;

        downsize();

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

    /**
     * delete item at index, shifting all trailing elements left
     */
    public void delete(int index) {
        if (index <= lastIndex && index >= 0) {
            int current = index;
            int value = current + 1;

            while(current < lastIndex) {
                array[current] = array[value];
                current++;
                value++;
            }

            lastIndex--;
            downsize();
        }
    }

    /**
     * looks for value and removes index holding it (even if in multiple places)
     */
    public void remove(String value) {
        int currentIndex = 0;

        while(currentIndex < lastIndex) {
            if(array[currentIndex].equals(value)) {
                delete(currentIndex);
            }

            currentIndex++;
        }
    }


    public void printElements() {
        System.out.print("[ ");
        for(int i = 0; i < lastIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public void printArray() {
        System.out.print("[ ");
        for (String value : array) {
            System.out.print(value + " ");
        }
        System.out.println("]");
    }

    /**
     * when you reach capacity, resize to double the size
     */
    private void upsize() {
        if(lastIndex < capacity()) {
            return;
        }

        int newSize = capacity() * 2;
        this.array = copyArray(newSize);

    }

    /**
     * if size is 1/4 of capacity, resize to half
     */
    private void downsize() {
        if(array.length / 4 == lastIndex) {
            int newSize = capacity() / 2;
            this.array = copyArray(newSize);
        }
    }

    private String[] copyArray(int size) {
        String[] newArray = new String[size];

        for(int i = 0; i < size(); i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
