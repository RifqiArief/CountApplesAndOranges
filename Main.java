package coba;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("s : ");
        int s = input.nextInt();
        System.out.print("t : ");
        int t = input.nextInt();
        System.out.print("a : ");
        int a = input.nextInt();
        System.out.print("b : ");
        int b = input.nextInt();
        System.out.print("m : ");
        int m = input.nextInt();
        System.out.print("n : ");
        int n = input.nextInt();

        System.out.println("Apples : ");
        int[] apples = new int[m];
        for(int i=0;i<m;i++){
            apples[i] = input.nextInt();
        }

        System.out.println("Oranges : ");
        int[] oranges = new int[n];
        for(int j=0;j<m;j++){
            oranges[j] = input.nextInt();
        }
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApple = 0;
        int countOrange = 0;
        for(int ap=0;ap<apples.length;ap++){
            apples[ap] = a + apples[ap];
            if(apples[ap] >= s && apples[ap] <=t){
                countApple++;
            }
        }

        for(int or=0;or<oranges.length;or++){
            oranges[or] = b + oranges[or];
            if(oranges[or] >= s && oranges[or] <=t){
                countOrange++;
            }
        }

        System.out.println(countApple);
        System.out.println(countOrange);
    }
}

