package exe_Arrays;

import java.util.HashMap;
import java.util.Map;

public class Lab134 {
    public static void main(String[] args) throws java.lang.Exception{
        //Find duplicate element in ana array [using Hashmap or hashset]
        int[] arr ={1, 2, 4, 32, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]+1));
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> ele:map.entrySet()){
            if(ele.getValue()>1) {
                System.out.println(ele.getKey());
                break;
            }
        }
    }
}
