package HashMap;
import java.util.HashMap;
import java.util.Set;

public class Create {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();
        //Insert
        hm.put("india", 100);
        hm.put("china",150);
        System.out.println(hm);
        //get
        int population=hm.get("india");
        System.out.println(population);
        //iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);
    }
}
