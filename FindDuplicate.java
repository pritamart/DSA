import java.util.HashMap;
import java.util.Map;

public class FindDuplicate{
    public static void findDuplicate(Integer arr[]){
        HashMap<Integer, Integer> content = new HashMap<>();
        for(int element : arr){
            content.put(element, content.getOrDefault(element, 0)+1);
        }
        for(Map.Entry<Integer,Integer> map : content.entrySet()){
            if(map.getValue() > 1){
                System.out.println(map.getKey()+" "+map.getValue());
            }
        }
    }
    public static void main(String[] args) {
        Integer arr[] ={1,2,3,1,2,4,1,1};
        System.out.println();
        findDuplicate(arr);
        
    }
}