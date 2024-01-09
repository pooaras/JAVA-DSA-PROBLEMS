
import java.util.*;
import java.util.Map.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
        hm1.put("poovi",100);
        hm1.put("araz",99);
        hm1.put("poo",44);
        System.out.println(hm1.get("araz"));
        hm1.remove("araz");
        for(Entry<String,Integer> e: hm1.entrySet()){
            System.out.println("key "+e.getKey()+" value "+e.getValue());
        }
    }
}
