package lab4;

public class LogicalOp {


    //Java For Loops
        // ex.1
        public void countTo100From(int nr){
        if(nr >= 100){
            System.out.println("The number should be less than 100");
        } else {
            for(int i = nr; i <= 100; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // ex.2
    public void countToMinus100From(int nr){
        if(nr <= -100){
            System.out.println("The number should be bigger than -100");
        } else {
            for(int i = nr; i >= -100; i--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    //ex.3
    public void countBetween(int nr1, int nr2){
        for(int i = nr1; i <= nr2; i++){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    //ex.4
    public void countBetweenOrdered(int nr1, int nr2){
        int firstNr = 0, secondNr = 0;
        if(nr1 >= nr2){
            firstNr = nr2;
            secondNr = nr1;
        } else {
            firstNr = nr1;
            secondNr = nr2;
        }
        for(int i = firstNr; i <= secondNr; i++){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    //ex.5
    public void printOddNumbersBetween1and100(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //ex.6
    public void printEvenNumbersBetween1and100(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //ex.7
    public void printSumBetween1and100(int nr){
        int result = 0;
        for(int i = nr; i <= 100; i++){
            result += i;
        }
        System.out.println(result);
    }
    //ex.9
    public void printPattern(int nrOfStars){
        for(int i = nrOfStars; i > 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*");
    }
}
