package MyPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.lang.*;

public class GenericTest {
    public static void main(String[] args) {
        collectionAPI();
        ListAPI();
    }
    public static void collectionAPI(){
        Collection<String> collection = new ArrayList();
        Collections.addAll(collection, "Sean","Yibo","star");
        Collection<String> temp = new ArrayList<>();
        temp.add("star");
        collection.removeAll(temp);
        String[] str = collection.toArray(new String[temp.size()]);
        System.out.println(collection);
        System.out.println(temp);
    }

    public static void ListAPI(){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,12,154,15384,85468,45,6);
        list.remove(3);
        list.remove(Integer.valueOf(45));
        System.out.println(list);
    }
}
