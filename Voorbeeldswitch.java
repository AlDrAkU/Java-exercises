public class Voorbeeldswitch {
    public static void main(String[] args) {
        char keuze = 'a';
        switch (keuze){

            case 'a':
                System.out.println("keuze a");
                break;
            case 'A':
                System.out.println("keuze A");
                break;
            case 'b':
                System.out.println("keuze b");
                break;
            case 'B':
                System.out.println("keuze B");
                break;
            default:
                System.out.println("default keuze.");
                break;

        }
    }
}
