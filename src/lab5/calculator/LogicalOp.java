package lab5.calculator;
import java.util.Arrays;
import java.util.List;
public class LogicalOp {
    //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
    // valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] count() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
// si sa il returneze populat cu toate valorile pare de la 1 la 100.
// Apelati metoda in main() pentru a verifica daca functioneaza.
// Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
    public int[] pare() {
        int[] array = new int[100];
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return array;
    }
    //4. Creati o metoda care sa primeasca un parametru de tip array de numere,
    // si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public double[] media() {
        double array[] = {2, 55, 88, 11, 21.5};
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double med = total / array.length;
        System.out.println(med);
        return array;
    }
    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri,
    // populat cu valori, si un parametru de tip String. Metoda sa verifice daca
    // valoarea string-ului primit se regaseste in array-ul primit,
    // iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String[] daca() {
        String x = "table";
        String[] backpack = {"pen", "paper", "peper", "salt"};
        List<String> list = Arrays.asList(backpack);
        if (list.contains(x)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return backpack;
    }
    //6. Creati o metoda care sa primeasca un parametru de tip array de numere,
// populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla
// in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
// Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] valori() {
        int x = 22;
        int[] arr;
        arr = new int[4];
        arr[0] = 22;
        arr[1] = 25;
        arr[2] = 15;
        arr[3] = 88;
        for (int i = 0; i < 1; i++)
            System.out.println(i);
        return arr;
    }
    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    public int[] grila() {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < x.length; i++) {
            System.out.print("---------");
            for (int j = i; j < x.length; j++) ;
            System.out.println("-");
        }
        return x;
    }
    //8. Creati o metoda care sa primeasca un parametru de tip array de numere,
// populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul exista in array,
// si daca da, sa returneze array-ul primit, fara acel numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] populat() {
        int x = 22;
        int[] arr;
        arr = new int[4];
        arr[0] = 22;
        arr[1] = 25;
        arr[2] = 15;
        arr[3] = 88;
        for (int i = 1; i < arr.length; i++) {
            System.out.println(i);
        }
        return arr;
    }
    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array
// . Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] alDoilea() {
        int[] arr;
        arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        for (int i = 1; i < 2; i++)
            System.out.println(arr[i]);
        return arr;
    }
    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori,
// si un array gol. Metoda sa copieze toate valorile din primul array, parcurgandu-l,
// in cel de-al doilea. Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] copiaza() {
        int[] arr = {1, 2, 3, 4};
        int[] newArr = new int[arr.length];
        newArr = arr;
        newArr[0]++;
        for (int i = 1; i < newArr.length; i++)
            System.out.println(i);
        return arr;
    }
    //1. Creati o metoda care sa returneze al doilea cel mai mic numar dintr-un array.
    public int[] returneazaALdoilea() {
        int[] x = {11, 22, 33, 44};
        for (int i = 1; i < 2; i++)
            System.out.println(x[i]);
        return x;
    }
    //2. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
    public int[] pozitie() {
        int[] arr;
        arr = new int[5];
        arr[3] = 12;
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        return arr;
    }
    //3. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.
    public int[] mare() {
        int[] arr;
        arr = new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 1;
        int mic = arr[0];
        int mare = arr[0];
        for (int i = 0; i <= 4; i++) {
            if (arr[i] < mic) mic = arr[i];
            if (arr[i] > mare) mare = arr[i];
        }
        System.out.print(mic + "  " + mare);
        System.out.println();
        return arr;
    }
    //4. Creati o metoda care sa inverseze valorile unui array de int-uri.
    public int[] inverseaza() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i]);
        return a;
    }
    //5. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
    public int[] duplicate() {
        int[] arr = {6, 2, 3, 4, 5, 6, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
        return arr;
    }
    //6. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).
    public String[] comune() {
        String[] geanta = {"portmoneu", "servetele", "telefon"};
        String[] ghiozdan = {"penar", "srevetele", "caiete"};
        for (int i = 0; i < geanta.length; i++) {
            for (int j = 0; j < ghiozdan.length; j++)
                if (geanta[i].equals(ghiozdan[j]))
                    System.out.println(geanta[i]);
        }
        return geanta;
    }
    //7. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.
    public int[] ordonat() {
        int[] arr = {2, 99, 8, 40, 15};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
