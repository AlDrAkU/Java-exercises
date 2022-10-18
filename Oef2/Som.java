package Oef2;

public class Som {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Som s = new Som();
        s.BerekenSom(a,b);

    }
    public int BerekenSom(int a, int b){
        System.out.println(a+b);
        return a + b;
    };
}
