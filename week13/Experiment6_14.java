package week13;

import java.util.Scanner;

public class Experiment6_14 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int p, l, t, L, vol;

        System.out.print("Input length : ");
        p = input.nextInt();
        System.out.print("Input width : ");
        l = input.nextInt();
        System.out.print("Input height : ");
        t = input.nextInt();

        L = calculateArea(p, l);
        System.out.println("Area of the rectangle : " + L);
        vol = calculateVolume(p, l, t);
        System.out.println("Volume of the rectangle : " + vol);
    }
    static int calculateArea(int l, int w) {
        int area = l * w;
        return area;
    }

    static int calculateVolume(int l, int w, int h) {
        int volume = l * w * h;
        return volume;
    }
}
