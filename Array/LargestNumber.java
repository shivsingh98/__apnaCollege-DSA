package Array;

public class LargestNumber {
    public static int maxNumber(int numbers[]){
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE; // -Infinity

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 20, 3, 4, 5, 6};

        System.out.println("Largest number is : " + maxNumber(numbers));
    }
}
