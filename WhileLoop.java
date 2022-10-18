public class WhileLoop {
    public static void main(String[] args) {

        String s = "Brussel";

        int i = 0;
        System.out.println(s.length());
        while (i<= s.length()){
            System.out.println(s.substring(0,i));
            i++;
        }
        System.out.println("printing done.");
    }
}
