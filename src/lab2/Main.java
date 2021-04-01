package lab2;

public class Main {

    public static void main(String[] args) {
        int i = inmultire(100, 5);
        System.out.println("rezultatul inmultirii este =" + i);
        float ii = impartire(25, 4);
        System.out.println("rezultatul impartirii este =" + ii);

    }

    public static int inmultire(int first, int second) {
        int inmultire = first * second;
        return inmultire;
    }

    public static float impartire(int first, int second) {
        float impartire = first / second;
        return impartire;


    }
}
