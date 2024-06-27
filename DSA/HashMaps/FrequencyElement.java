package HashMaps;
import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,1,5,3,1,4,4};
        Map<Integer,Integer> mp = new HashMap<>();
        
        for (var e : arr) {
            if (!mp.containsKey(e)) {
                mp.put(e,1);
            }
            else {
                mp.put(e,mp.get(e) + 1);
            }
        }
        System.out.println("Frequecy Map");
        System.out.println(mp.entrySet());

        int maxFreq = 0, ansKey = -1;
        for (var e : mp.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey);
    }
}
