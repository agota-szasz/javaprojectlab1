package lab3;

public class Main{

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        int nr2 = 2;
        int nr3 = 3;
        int nr5 = 5;
        int nr9 = 9;
        int nr20 = 20;
        int nr21 = 21;
        int nr22 = 22;
        String str1 = "FastTrackIT";
        String str2 = "FastTrackIT";
        System.out.println("checkBiggerNumber for " + nr2 + " and " + nr3 + " : "  + op.checkBiggerNumber(nr2, nr3));
        System.out.println("learnTextComparison for " + str1 + " : "  + op.learnTextComparison(str1));
        System.out.println("compareStringWithInt for " + str2 + " and " + nr5 + " : "  + op.compareStringWithInt(str2, nr5));
        System.out.println("snow for " + nr9 + " : "  + op.snow(nr9));
        System.out.println("compareWith3and4 for " + nr5 + " : "  + op.compareWith3and4(nr5));
        System.out.print("switchCase for " + nr5 + " : ");
        op.switchCase(nr5);
        System.out.println("isNumberEven for " + nr5 + " : "  + op.isNumberEven(nr5));
        System.out.println("isEligibleToVote for " + nr20 + " : "  + op.isEligibleToVote(nr20));
        System.out.println("checkBiggerNumberAmongThree for " + nr2 + " and " + nr3 + " and " + nr5 + " : "  +
                op.checkBiggerNumberAmongThree(nr2, nr3, nr5));


        Calculator calc = new Calculator();
        calc.printName("Agota Szasz");
        System.out.println("sum1 for " + nr2 + " and " + nr3 + " : "  + calc.sum1(nr2, nr3));
        System.out.println("devide1 for " + nr2 + " and " + nr3 + " : "  + calc.divide1(nr2, nr3));
        System.out.println("sumMultiply1 for " + nr2 + " and " + nr3 + " and " + nr5 + " : "  + calc.sumMultiply1(nr2, nr3, nr5));
        System.out.println("sumModulo1 for " + nr2 + " and " + nr3 + " and " + nr5 + " : "  + calc.sumModulo1(nr2, nr3, nr5));
        System.out.println("sumMultiplyDevide1 for " + nr2 + " and " + nr3 + " and " + nr5 + " and " + nr20 + " : "  + calc.sumMultiplyDevide1(nr2, nr3, nr5, nr20));
        System.out.println("ex14d for " + nr2 + " and " + nr3 + " and " + nr5 + " and " + nr20 + " and " + nr21 + " and " + nr22 +" : "  + calc.ex14d(nr2, nr3, nr5, nr20, nr21, nr22));

    }
}