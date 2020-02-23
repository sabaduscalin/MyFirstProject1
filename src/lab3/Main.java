
    package lab3;
import java.util.Scanner;
import static lab2.Main.*;
    public class Main {
        public static void main(String[] args) {
            System.out.println("Rezultatul este : " + sum(2, 4));
            System.out.println("Rezultatul este : " + impartire(21,4));
            System.out.println("Rezultatul este : " + tot(-5, 8, 6));
            System.out.println("Rezultatul este : " + total(55, 9));
            System.out.println("Rezultatul este : " + net(20, -3, 5, 8));
            System.out.println("Rezultatul este : " + tot(5, 15, 3, 2, 8, 3));
            System.out.println("Rezultatul  este: " + rez(2, 3));
            System.out.println("Rezultatul  este: " + egal(6, 3));
            System.out.println("Rezultatul  este: " + imp(66, 9));
            System.out.println("Rezultatul este : " + inmultire(123456, 654321));
            System.out.println("Media este " + media(10, 8, 4));
            System.out.println(impartire(21, 3));
            double fahranheit, formula, celsius;
            fahranheit = 120;
            celsius = ((fahranheit - 32) * 5 / 9);
            System.out.println("120 F repreinta " + celsius + " C");
            double inch, metri, rate;
            rate = 0.02540000;
            inch = 100;
            System.out.println();
            metri = rate * inch;
            System.out.println("100 inch este egal cu " + metri + " metri");
        }
    }


