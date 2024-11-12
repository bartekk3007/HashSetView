import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Andrzej");
        hashMap.put(4, "Dariusz");
        hashMap.put(3, "Cezary");
        hashMap.put(2, "Bartek");
        Set<Integer> keys = hashMap.keySet();
        keys.remove(1);
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));

        Set<Map.Entry<Integer, String>> entry = hashMap.entrySet();
    }
}