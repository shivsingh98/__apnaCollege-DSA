package Array;

public class SubArray {
    public static void printSubArray(int numbers[]){
        int ts = 0;

        for(int i=0; i<numbers.length; i++){
            
            for(int j=i; j<numbers.length; j++){
                
                int sum = 0;
              
                for(int k= i; k<= j; k++){
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray : " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
