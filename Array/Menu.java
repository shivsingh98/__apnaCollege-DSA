package Array;

public class Menu {

    public static int menu( String items[], String item){
        for(int i=0; i<items.length; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String items[] = {"samosa", "chai", "maggi", "dosa", "coffee"};
        String item = "coffee";

        int result = menu(items, item);
        if(result == -1){
            System.out.println("Sorry! "+ item +" is not avaliable.");
        }else{
            System.out.println("Your order is being proccessed.");
        }
    }
}
