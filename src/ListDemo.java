import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("yoga");
        list.add("vaibhav");
        list.add("viswa");
        Collections.addAll(list,"saran","sharath","thamiz","sanjai");
        list.add(0,"yogavarshan");
        System.out.println(list.set(0,"hahaha"));
        System.out.println(list.indexOf("viswa"));
    }
}
