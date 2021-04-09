package lab3;

public class Calculator {


    public void printName(String name) {
        System.out.println("Hello " + name + "!");
    }


    public float sum1(float first, float second) {
        return first + second;
    }


    public float divide1(float first, float second) {
        return first / second;
    }


    public int sumMultiply1(int first, int second, int third) {
        return first + second * third;
    }


    public int sumModulo1(int first, int second, int third) {
        return (first + second) % third;
    }


    public float sumMultiplyDevide1(float first, float second, float third, float four) {
        return first + second * third / four;
    }


    public int ex14d(int a, int b, int c, int d, int e, int f) {
        return a + b / c * d - e % f;
    }


    public float sum2(float first, float second) {
        return first + second;
    }

    public float substraction2(float first, float second) {
        return first - second;
    }

    public float multiply2(float first, float second) {
        return first * second;
    }

    public float divide2(float first, float second) {
        return first / second;
    }


    public void printProgramName(String exercise) {
        System.out.println(exercise);
        System.out.println("   J    A    V     V    A   ");
        System.out.println("   J   A A    V   V    A A  ");
        System.out.println("J  J  AAAAA    V V    AAAAA ");
        System.out.println(" JJ  A     A    V    A     A");
    }


    public float averageNumber(float first, float second, float third) {
        return (first + second + third) / 3;
    }


    public void printFace(String exercise) {
        System.out.println(exercise);
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +-----+ ");
    }


}
