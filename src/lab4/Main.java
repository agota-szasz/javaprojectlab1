package lab4;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        op.countTo100From(27);

        op.countToMinus100From(27);

        op.countBetween(27, 88);

        op.countBetweenOrdered(66, 22);

        op.printOddNumbersBetween1and100();

        op.printEvenNumbersBetween1and100();

        op.printSumBetween1and100(30);

        op.printPattern(10);

    }
}



