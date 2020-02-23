
    package lab4.calculator;
    public class LogicalOp {
        //3. In clasa LogicalOp, creati o metoda de tip int,
// care sa se numeasca checkBiggerNumber()
// , si sa primeasca doua int-uri ca si parametrii.
// Folosind if - else, verificati in interiorul metode care
// numar este mai mare, dintre cele doua valori care va vin
// ca si parametrii, si returnati numarul mai mare.
        public int checkBiggerNumber(int a, int b) {
            if (a > b) {
                return a;
            } else if (b > a) {
                return b;
            } else {
                return b;
            }
        }
        //4. Creati o metoda de tip String, care sa primeasca un parametru de tip String.
// Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
// Daca da, atunci metoda sa returneze “Learning text comparison”.
// Daca nu, atunci metoda sa returneze “Got to try some more”.
        public String checkText(String x) {
            if (x.equals("FastTrackIT")) {
                return ("Learning text comparison");
            } else {
                return ("Got to try some more");
            }
        }
        //5. Creati o metoda de tip String, care sa primeasca un parametru
        // de tip String, si un parametru de tip int. Daca textul primit ca si
        // parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru
        // este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
        // Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
        // returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.
        public String check(String x, int y) {
            if (x.equals("FastTrackIT") && (y <= 3)) {
                return x + y;
            } else if (!x.equals("FastTrackIT") && (y >= 4)) {
                return y + x;
            } else {
                return y + x;
            }
        }
        //6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
// Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
// “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze
// “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.
        public String snow(int x) {
            if ((x > 8 || (x == 6))) {
                return "The amount of snow this winter was(cm): " + x;
            } else {
                return "The forecast snow is(cm): " + x;
            }
        }
        //7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
// Daca numarul e mai mare decat 3, SI nu egal cu 4,
// returnati “The number is greater than 3 and not equal to 4”.
// Daca numarul este egal cu 4, returnati “The number is equal to 4”,
// iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
// Apelati metoda in main() pentru a verifica daca functioneaza.
        public String big(int x) {
            if ((x > 3) && (x != 4)) {
                return "The number is greater than 3 and not equal to 4";
            } else if (x == 4) {
                return "The number is equal to 4";
            } else if (x < 3) {
                return "The number is lower than 3";
            } else {
                return "The number is lower than 3";
            }
        }
        //8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
// Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
// "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. Pentru exemplul
// de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru,
// ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
// Apelati metoda in main() pentru a verifica daca functioneaza.
        public int number(int x) {
            switch (x) {
                case 1:
                    System.out.println("The number is: 1");
                    break;
                case 2:
                    System.out.println("The number is: 2");
                    break;
                case 3:
                    System.out.println("The number is: 3");
                    break;
                case 4:
                    System.out.println("The number is: 4");
                    break;
                case 5:
                    System.out.println("The number is: 5");
                    break;
                default:
                    System.out.println("Not in 1,2,3,4,5 ");
            }
            return x;
        }
        //9. Creati o metoda care sa se numeasca isNumberEven.
// Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
// Daca numarul e par sa returneze true iar daca e impar sa returnese false.
// Apelati metoda in main() pentru a verifica daca functioneaza.
        public boolean isNumberEven(int x) {
            if (x % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
        //10. Creati o metoda care sa se numeasca isEligibleToVote.
// Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
// iar metoda sa iti zica daca daca persoana are drept de vot.
// Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
// Apelati metoda in main() pentru a verifica daca functioneaza.
        public boolean isEligibleToVote(int x) {
            if (x >= 18) {
                return true;
            } else {
                return false;
            }
        }
        //11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.
        public int bigger(int x, int y, int z) {
            if (x > y && x > z) {
                return x;
            } else if (y > x && y > z) {
                return y;
            } else {
            }
            return z;
        }
        //        //afisare numere pare de la 0 la -100
        public void print(int x) {
            int count = 0;
            for (int i = x = 1; i > -100; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        //Tema - Java For Loops
        //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
        // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
        // deoarece metoda afiseaza, nu returneaza.
        public void numaratoare(int x) {
            for (int i = x; i <= 100; i++) {
                System.out.println(i);
            }
        }
        //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
// pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
// deoarece metoda afiseaza, nu returneaza.
        public void minus(int x) {
            for (int i = x; i >= -100; i--) {
                System.out.println(i);
            }
        }
        //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite,
// pornind de la primul parametru primit, pana la cel de-al doilea
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
        public void doi(int x, int y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
        //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
// si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
//(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
// atunci numaratoarea sa fie de la y la x).
        public void creste(int x, int y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        }
        //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100
        public void pare() {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
        public void imp() {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
        //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
// iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main()
// pentru a verifica daca functioneaza.
        public int aduna100(int x) {
            int sum = 0;
            while (x <= 100) {
                sum += x;
                x++;
            }
            return sum;
        }
        //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
//si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main,
// metoda main() pentru a verifica daca functioneaza.
        public int media(int x) {
            int sum = 0;
            int med = 0;
            int counter = 0;
            while (x <= 100) {
                sum += x;
                x++;
                counter++;
            }
            med = sum / counter;
            return med;
        }
        //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
        public void piramida() {
            int x = 7;
            for (int i = 1; i <= x; i++) {
                for (int j = x; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // Tema - Java While Loop
//1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
// deoarece metoda afiseaza, nu returneaza.
        public void numOsuta(int x) {
            while (x <= 100) {
                System.out.println(x);
                x++;
            }
        }
        //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
// pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
// deoarece metoda afiseaza, nu returneaza.
        public void invers(int x) {
            while (x >= -100) {
                System.out.println(x);
                x--;
            }
        }
        //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
// pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
// numaratoarea sa se faca de la x, la y.
        public void douaNumere(int x, int y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        }
        //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si
// sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
// daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
        public void cresc(int x, int y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        }
        //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
        public void nrPare() {
            int x = 1;
            while (x <= 100) {
                if (x % 2 == 0) {
                    System.out.println(x);
                }
                x++;
            }
        }
        //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
        public void nrImpare() {
            int x = 1;
            while (x <= 100) {
                if (x % 2 != 0) {
                    System.out.println(x);
                }
                x++;
            }
        }
        //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
// Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
// Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
        public void sumaSimedia() {
            int x = 111;
            int y = 8899;
            float sum = 0;
            int counter = 0;
            float media = 0;
            while (x < y) {
                sum += x;
                x++;
                counter++;
            }
            media = sum / counter;
            System.out.println(sum);
            System.out.println(media);
        }
        //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze
// media numerelor divizibile cu 7, din acel interval.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
        public void divCu7(int x, int y) {
            int sum = 0;
            int count = 0;
            int media = 0;
            while (x < y) {
                sum += x;
                x++;
                count++;
            }
            media = sum / count;
            if (media % 7 == 0) ;
            System.out.println(media);
        }
        //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
        public void fibonacci() {
            int x = 0;
            int y = 1;
            for (int i = 1; i <= 20; i++) {
                System.out.print(x + " ");
                int sum = x + y;
                x = y;
                y = sum;
            }
            System.out.println();
        }
        //10. Creati o metoda numita CozaLozaWoza.
//Metoda va afisa:
//- numerele de la 1 la 110
//- 11 numere pe linie
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
        public void cozaLozaNoza() {
            int i = 1;
            while (i <= 110) {
                boolean flag = false;
                if (i % 3 == 0) {
                    System.out.print("Coza");
                    flag = true;
                }
                if (i % 5 == 0) {
                    System.out.print("Loza");
                    flag = true;
                }
                if (i % 7 == 0) {
                    System.out.print("Woza");
                    flag = true;
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("CozaLoza");
                    flag = true;
                }
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("CozaWoza");
                    flag = true;
                }
                if (i % 5 == 0 && i % 7 == 0) {
                    System.out.println("WozaLoza");
                    flag = true;
                }
                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                    System.out.println("CozaWozaLoza");
                    flag = true;
                }
                if (!flag) {
                    System.out.print(i);
                }
                System.out.print(" ");
                if (i % 11 == 0) {
                    System.out.println();
                }
                i++;
            }
        }
    }

