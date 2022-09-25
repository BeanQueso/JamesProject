import java.util.Scanner;

public class Dollars
{
    public static void main(String[] args)
    {
        Scanner original_inp = new Scanner(System.in);
        int original_input = original_inp.nextInt();
        
            System.out.println("Welcome to the cash to change calculator.");

            int amount_of_100s = 0;
            int amount_of_50s = 0;
            int amount_of_20s = 0;
            int amount_of_10s = 0;
            int amount_of_5s = 0;
            int amount_of_1s = 0;

            while(original_input >= 100){
                original_input = original_input-100;
                amount_of_100s=amount_of_100s+1;
            };
            while(original_input >= 50){
                original_input = original_input-50;
                amount_of_50s=amount_of_50s+1;
            };
            while(original_input >= 20){
                original_input = original_input-20;
                amount_of_20s=amount_of_20s+1;
            };
            while(original_input >= 10){
                original_input = original_input-10;
                amount_of_10s=amount_of_10s+1;
            };
            while(original_input >= 5){
                original_input = original_input-5;
                amount_of_5s=amount_of_5s+1;
            };
            while(original_input >= 1){
                original_input = original_input-1;
                amount_of_1s=amount_of_1s+1;
            };

            System.out.println("Converting your cash into: \n"+amount_of_100s+" 100s, \n"+amount_of_50s+" 50s, \n"+amount_of_20s+" 20s, \n"+amount_of_10s+" 10s, \n"+amount_of_5s+" 5s, \n"+amount_of_1s+" 1s");
        
    }
}