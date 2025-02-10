package Day3;

import java.util.Scanner;

/*
 * 1. take an input from user in range [0,100]
 * 2. validate the i/p and give error output depending on same
 * 3. generate a random no. in range [0,100]
 * 4. check if the guessed no is correct the give output with a msg and no. of attempts it took
 * 5. if the guessed no. is greater/smaller then random no give output
 * 6. repeate the process of guessing for same random no. till user want to continue(optional)
 */

public class guestimation {
    public static int Random(){
        /*
         * implement logic to get a random value and return it!
         */
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = (int)(Math.random()%101);

        int attempts = 0;
        boolean flag = true;
        while(flag){
            int g = sc.nextInt();
            attempts++;
            if(!(g >= 0 && g <= 100)){
                System.err.println("You have not given a valid i/p. Try again!!");
                continue;
                // return;
            }
            if(g == r)System.out.println("You have guessed a right no. and you took "+attempts+" attempts to guess.");
            else{
               String str = (g > r ? "greater" : "smaller");
               System.out.println("the guessed no. is "+str+" from the r no.!");
            }
            System.out.println("you want to continue?(0/1):");
            int f = sc.nextInt();
            if(f == 0)return;
        }

        sc.close();
    }
}
