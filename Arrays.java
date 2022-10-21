public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        int[]b = new int[10];

        a = new int[10];
//        b = a;
//        b[4] = 10;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
//            System.out.println(b[i]);
        }
    }
}
