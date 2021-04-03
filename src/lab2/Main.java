package lab2;

public class Main {

    public static void main(String[] args) {
        int i = inmultire(100, 5);
        System.out.println("rezultatul inmultirii este =" + i);
        float ii = impartire(25, 4);
        System.out.println("rezultatul impartirii este =" + ii);
        int iii = adunare(100,67);
        System.out.println("rezultatul adunarii este =" +iii);
        int iiii = scadere(150,100);
        System.out.println("rezultatul sacderii este ="+ iiii);
        printJavaExercitiu3();





    }

    public static int inmultire(int first, int second) {
        int inmultire = first * second;
        return inmultire;
    }

    public static float impartire(int first, int second) {
        float impartire = first / second;
        return impartire;

    }

    public static int adunare(int first, int second) {
        int adunare = first + second;
        return adunare;


    }
    public static int scadere (int first, int second) {
        int scadere = first - second;
        return scadere;

    }
    public static void printJavaExercitiu3() {
        System.out.println( "       j     a        v     v      a");
        System.out.println( "       j    a a        v   v      a a");
        System.out.println( "   j   j   aaaaaa       v v      aaaaa");
        System.out.println( "     jj   a      a       v      a      a");

    }




}
