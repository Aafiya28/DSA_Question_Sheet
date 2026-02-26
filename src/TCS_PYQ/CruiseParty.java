package TCS_PYQ;

import java.util.ArrayList;
import java.util.Scanner;

public class CruiseParty {

    static int[] party(int[] enterG, int[] leftG){

        int n = enterG.length;

        int currentGuests = 0;
        int maxGuests = 0;
        int maxhour = 0;

        for (int i = 0; i < n; i++) {
            currentGuests += enterG[i] - leftG[i];

            if (currentGuests > maxGuests) {
                maxGuests = currentGuests;
                maxhour = i + 1;   // ✅ update only here
            }
        }

        return new int[]{ maxhour, maxGuests};
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//      System.out.print("Enter guest's: ");
        int[] enterGuest = {3, 4, 2, 1, 0};
        int[] c1E =  {7,0,5,1,3};

//      System.out.print("Left guest's: ");
        int[] leftGuest = {1, 3, 0, 2, 3};
        int[] c1L = {1,2,1,3,4};

        int result[] = party(enterGuest, leftGuest);
        int case1[] = party(c1E, c1L);

        System.out.println("Maximum number of guest on cruise at an instance: ");
        System.out.println("Hour: " + result[0]);
        System.out.println("Max Guests: " + result[1]);
        System.out.println("In another case: ");
        System.out.println("Hour: " + case1[0]);
        System.out.println("Max Guests: " + case1[1]);
    }
}
