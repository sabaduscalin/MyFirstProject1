package lab6;
import javafx.collections.transformation.TransformationList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> myList2 = new ArrayList<>();
        myList2.add("unu");
        myList2.add("doi");
        myList2.add("trei");
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        LogicalOp op = new LogicalOp();
        op.printList(myList);
        op.finalList(myList, 555);
        op.stepBystep(myList, 3);
        op.invers(myList);
        op.trei(myList2, 1, "Hello");
        op.doiParametri(myList, 11);
        op.valori(myList);
        op.returList(myList);
        op.schimba(myList);
        op.pare(myList);
    }
}
