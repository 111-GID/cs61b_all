import java.util.*;

public class homework0b {



     public static void main(String[] args) {
        int[] array=new int[5];
        int[] array1={0,3,8,6,4};
        for(int i : array1){
            System.out.println(i);
        }
//列表（可调整大小）
        List<String> lst = new ArrayList<>();//ArrayList 是一个动态数组，可以根据需要调整大小，而 List 是一个接口
         //创建了一个 ArrayList 的实例，并将其赋值给 List 接口类型的变量 lst。
        lst.add("zero");
        lst.add("one");
        lst.set(0, "zed");
         //这行代码将列表中索引为 0 的元素（即 "zero"）替换为 "zed"。set 方法用于更新指定索引处的元素。
        System.out.println(lst.get(0));
        System.out.println(lst);
         System.out.println(lst.size());
         for (String elem : lst) {
             System.out.println(elem);
         }
         if (lst.contains("one")) {
             System.out.println("one in lst");
         }
//集合
// Set接口表示一个不包含重复元素的集合。HashSet没有定义元素的顺序。这意味着元素在集合中的位置是不可预测的。
//HashSet通常非常快，尤其是在执行插入、删除和查找操作时。其实现基于哈希表，因此这些操作的平均时间复杂度为O(1)。
         Set<Integer> set = new HashSet<>();
         //对于int，其对应的包装类型是Integer。
         set.add(1);
         set.add(1);
         set.add(2);
         set.remove(2);
         System.out.println(set.size());
         if (set.contains(1)) {
             System.out.println("1 in set");
         }
         for (int elem : set) {
             System.out.println(elem);
         }
//Java中使用`Map`接口，主要有`TreeMap`和`HashMap`两种实现。
// HashMap顺序：HashMap没有定义顺序，键值对的顺序是不可预知的。
// 一个Map不能包含重复的键。如果尝试添加一个已存在的键，新的值会覆盖旧的值。

         Map<String,String> m=new HashMap<>();
         m.put("hello", "hi");
         m.put("hello", "goodbye");//替换为goodbye
         System.out.println(m.get("hello"));
         System.out.println(m.size());
         if (m.containsKey("hello")) {
             System.out.println("\"hello\" in map");
         }
         for (String key : m.keySet()) {
             System.out.println(key);
         }

     }
//java类定义
    public class Point {
        public int x;
        public int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Point() {
            this(0, 0);
        }
        public double distanceTo(Point other) {
            return Math.sqrt(
                    Math.pow(this.x - other.x, 2) +
                            Math.pow(this.y - other.y, 2)
            );
        }
        public void translate(int dx, int dy) {
            this.x += dx;
            this.y += dy;
        }
    }
}
