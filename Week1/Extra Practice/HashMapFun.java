import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("sam@codingdojo.com", " Chunky Monkey");
        userMap.put("chris@codingdojo.com", " Strawberry Cheesecake");
        userMap.put("alex@codingdojo.com", " Rocky Road");
        userMap.put("herlan@codingdojo.com", " Chocolate Chip");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.printf((key) + "'s favorite ice cream flavor is" + (userMap.get(key)));    
        }
    }
}

