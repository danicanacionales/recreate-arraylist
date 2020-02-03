public class FindNumbersWithEvenNumberOfDigits {

    /**
     * 1295. Find Numbers with Even Number of Digits
     * Given an array nums of integers, return how many of them contain an even number of digits.
     */
    public int findNumbers(int [] nums) {
        int output = 0;

        for(int num : nums) {
            if(String.valueOf(num).length() % 2 == 0) {
                output++;
            }
        }

        return output;
    }
}
