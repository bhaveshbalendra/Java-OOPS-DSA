package HashMaps;
import java.util.Map;


import java.util.HashMap;

class KeyValue {
    public static void main(String[] args) {
            Map<String,Integer> mp = new HashMap<>();
            mp.put("Akash", 21);
            mp.put("Yash",16);
            mp.put("Lav",17);
            mp.put("Rishika",19);
            mp.put("Harry",18);
            mp.put("Akash", 19);
            System.out.println(mp.get("Akash"));
            System.out.println(mp.remove("Akash"));
            System.out.println(mp.containsKey("Akash"));
            mp.putIfAbsent("Bhavesh",21);
            System.out.println(mp.values());
            System.out.println(mp.keySet());
            System.out.println(mp.entrySet());

            //triverse


            for(String key : mp.keySet()) {
                System.out.printf("Age of %s is %d \n",key,mp.get(key));
            }
            System.out.println();
            for (Map.Entry<String,Integer> e : mp.entrySet()) {
                System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
            }
            System.out.println();

            for (var e : mp.entrySet()) {
                System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
            }
    }
}