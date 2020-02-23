
    package lab3.calculator;
import lab3.calculator.LogicalOp;
    public class Main {
        public static void main(String[] args) {
            LogicalOp op = new LogicalOp();
            System.out.println("The bigger number is : " + op.checkBiggerNumber(5, 8));
            System.out.println(op.checkText("ItFast"));
            System.out.println(op.check(" ItFast " , 51 ));
            System.out.println(op.snow(26));
            System.out.println(op.big(44));
            System.out.println(op.number(4));
            System.out.println(op.isNumberEven(12));
            System.out.println(op.isEligibleToVote(29));
            System.out.println(op.bigger(45,22,33));
        }
    }


