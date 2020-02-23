package lab4.calculator;
public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        System.out.println("The bigger number is : " + op.checkBiggerNumber(5, 8));
        System.out.println(op.checkText("ItFast"));
        System.out.println(op.check(" ItFast ", 51));
        System.out.println(op.snow(26));
        System.out.println(op.big(44));
        System.out.println(op.number(4));
        System.out.println(op.isNumberEven(12));
        System.out.println(op.isEligibleToVote(29));
        System.out.println(op.bigger(45, 22, 33));
        //lab4
        op.print(-100);
        op.numaratoare(89);
        op.minus(15);
        op.doi(5, 15);
        op.creste(21, 25);
        op.pare();
        op.imp();
        System.out.println(op.aduna100(48));
        System.out.println(op.media(15));
        op.piramida();
        op.numOsuta(1);
        op.invers(55);
        op.douaNumere(11, 17);
        op.cresc(8, 12);
        op.nrPare();
        op.nrImpare();
        op.sumaSimedia();
        op.divCu7(221, 9119);
        op.fibonacci();
        op.cozaLozaNoza();
    }
}
