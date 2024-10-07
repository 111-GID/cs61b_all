import java.util.Iterator;
/**
 * public interface Iterable<T>{
 *     Iterator<T> Iterator();
 * }
 * */
public class ArraySet <T> implements Iterable<T> {//没有implements Iterable<T> 则for (int i : s){}会报错
    private T[] items;
    private int size;

    public ArraySet(){
        items = (T[]) new Object[100];
        size=0;
    }

    public void add(T x){
        if(contains(x)){
            return ;
        }
        items[size]=x;
        size++;
    }

    public boolean contains(T x){
        for (int i=0 ; i<size ; i++){
            if(items[i].equals(x)){//在 Java 中，equals() 方法是用于比较两个对象是否“相等”的方法。它定义在 Object 类中，所有 Java 对象都继承了这个方法。
                return true;
            }
        }
        return false;
    }

    private class ArraySetIterator implements Iterator<T>{

        private int pos;//当前位置
        public ArraySetIterator(){
            pos=0;
        }
        @Override
        public boolean hasNext() {
            return pos<size;
        }

        @Override
        public T next() {
            T returnItem = items[pos];
            pos=pos+1;
            return returnItem;
        }
    }

    public Iterator<T> iterator(){
        return new ArraySetIterator();
    }
    /**object method*/
   // 1.System.out.println(Object x) 调用了 x.toString()
    //重写 toString()
    @Override
    public String toString(){//是Object 类 的方法
        String x="( ";
        for (T i: this){
            x += i.toString() + " ";//这里调用的toString 是T 这个 object的 toString
        }
        x += ")";
        return x;
    }

    //2.重写 equals()
    @Override
    public boolean equals(Object o){//必须是Object 而非 ArrayList
        if (o instanceof ArraySet otherArraySet){//判断 o 是否是 ArraySet,如果是则创建 otherArraySet 新变量 ，类型为 ArraySet
            if(this.size != otherArraySet.size){
                return false;
            }
            for (T i : this){
                if (!otherArraySet.contains(i)){
                    return false;
                }
            }
           return true;
        }
        return false;
    }

    public static void main(String[] args){
        ArraySet<Integer> s =new ArraySet<>();
        s.add(3);
        s.add(12);
        s.add(78);

        System.out.println(s.contains(3));
        System.out.println(s.contains(99));

        //ugly iteration
//        Iterator<Integer> seer = s.iterator();
//        while (seer.hasNext()){
//            int x = seer.next();
//            System.out.println(x);
//        }

        //nice iteration
        for (int i : s){
            System.out.println(i);
        }

        System.out.println(s);

    }
}
