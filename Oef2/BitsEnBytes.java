package Oef2;

import java.util.Scanner;

public class BitsEnBytes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many megabytes?");
        double megabytes = input.nextDouble();
        BitsEnBytes toBits = new BitsEnBytes();
        double kilobytes = toBits.Multiply1024(megabytes);
        System.out.println(kilobytes+" kilobytes");
        double bytes = toBits.Multiply1024(kilobytes);
        System.out.println(bytes+" bytes");
        double nibbles = bytes * 2;
        System.out.println(nibbles+" nibbles");
        double bits = bytes *8;
        System.out.println(bits+" bits");
    }
    public double Multiply1024(double value){
        return value * 1024;
    }
}
