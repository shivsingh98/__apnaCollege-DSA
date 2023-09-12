package Array;

public class MaxSubArraySum {
    public static int maxSubArraySum(int numbers[]){
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum = sum + numbers[k];
                }
               
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        System.out.println("Max subArray sum : " + maxSubArraySum(numbers));
    }
}
