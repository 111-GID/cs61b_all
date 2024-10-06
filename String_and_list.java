
import java.util.*;

public class String_and_list {
    public static void main(String[] args){
        String s="hello";
        s=s+"world";
        System.out.println(s.length());
        s+=5;
        if(s.indexOf("llo")!=-1){
            System.out.println("llo in s");
        }
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        System.out.println(s.substring(0,4));

        int[] zeroAerry=new int[4];
        int[] array={2,4,6,8,10};
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println(Arrays.toString(array));

        List<String> lis= new ArrayList<>();
        lis.add("abs");
        lis.add("eqc");
        lis.set(0, "zed");
        System.out.println(lis.get(0));
        System.out.println(lis.size());
        if (lis.contains("one")) {
            System.out.println("one in lis");
        }

        Map<String,String> m=new HashMap<>();
        m.put("hello","你好");
        m.put("good","加油");
        System.out.println(m.get("good"));
        if (m.containsKey("hello")) {
            System.out.println("\"hello\" in map");
        }
        if (m.containsValue("你好")) {
            System.out.println("\"你好\" in map");
        }
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    

    }
}
