package lab3;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public String learnTextComparison(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }

    public String compareStringWithInt(String text, int nr) {
        if (text.equals("FastTrackIT") && nr <= 3) {
            return text + nr;
        } else if (!text.equals("FastTrackIT") && nr >= 4) {
            return nr + text;
        }
        return "";
    }

    public String snow(int cmOfSnow) {
        if (cmOfSnow > 8 || cmOfSnow == 6) {
            return "The amount of snow this winter was(cm): " + cmOfSnow;
        }
        return "The forecast snow is(cm):" + cmOfSnow;
    }

    public String compareWith3and4(int nr) {
        if (nr > 3 && nr != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (nr == 4) {
            return "The number is equal to 4";
        } else if (nr < 3) {
            return "The number is lower than 3";
        }
        return "The number can't be equal to 3";
    }

    public void switchCase(int nr) {
        switch (nr) {
            case 1:
                System.out.println("The number is: " + 1 + " !");
                break;
            case 2:
                System.out.println("O número é: " + 2 + " !");
                break;
            case 3:
                System.out.println("Номер такой: " + 3 + " !");
                break;
            case 4:
                System.out.println("Il numero è: " + 4 + " !");
                break;
            case 5:
                System.out.println("El numero es: " + 5 + " !");
                break;
            case 6:
                System.out.println("Est Numerus: " + 6 + " !");
                break;
            case 7:
                System.out.println("Дугаар нь: " + 7 + " !");
                break;
            case 8:
                System.out.println("Ο αριθμός είναι: " + 8 + " !");
                break;
            case 9:
                System.out.println("Le nombre est: " + 9 + " !");
                break;
            case 10:
                System.out.println("号码是： " + 10 + " !");
                break;
            default:
                System.out.println("The number is: " + nr + " !");
        }
    }

    public boolean isNumberEven(int nr) {
        if (nr % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        }
        return false;
    }

    public int checkBiggerNumberAmongThree(int nr1, int nr2, int nr3) {
        if (nr1 > nr2 && nr1 > nr3) {
            return nr1;
        } else if (nr2 > nr1 && nr2 > nr3) {
            return nr2;
        } else if (nr3 > nr1 && nr3 > nr2) {
            return nr3;
        }
        return nr1;
    }
}