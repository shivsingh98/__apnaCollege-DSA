package Array;

public class ReverseArray {
    public static void reverse(int numbers[]){
        int start = 0; int last = numbers.length-1;

        while(start < last){
            //swap
            int temp = numbers[start];
            numbers[start] = numbers[last];
            numbers[last] = temp;
            start++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        reverse(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
