import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection= new ArrayList<>();
        collection.add("yoga");
        collection.add("vaibhav");
        collection.add("viswa");
        Collections.addAll(collection,"saran","sharath","thamiz","sanjai");
        System.out.println(collection);
        System.out.println(collection.contains("yoga"));
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        String [] stringArray = collection.toArray(new String[0]);

    }
}
