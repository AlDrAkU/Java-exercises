package Oef5;

import java.util.Random;

public class RandomGetallen {
    public static void main(String[] args) {
    int [] array_ints = new int [1000];
    Random rand = new Random();

        for (int i = 0; i < array_ints.length; i++) {
            array_ints[i] = rand.nextInt(150,10000);
            //System.out.println(array_ints[i]);
        }
        int [] kleinsteDrie = zoekKleinsteDrie(array_ints);
        for (int j : kleinsteDrie) {
            System.out.println(j);

        }
    }


    public static int[] zoekKleinsteDrie(int[] ints) {
        int [] kleinsteDrie = {10000,10000,10000};

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < kleinsteDrie[0]){
                    kleinsteDrie[2] = kleinsteDrie[1];
                    kleinsteDrie[1] = kleinsteDrie[0];
                    kleinsteDrie[0] = ints[i];
            }
        }
        return kleinsteDrie;
    }
}
