package basic_code;
/*
Lists I: References, Recursion, and Lists
 */

public class Myclass {
    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);//
        // 任何不属于int float....类型的叫做引用类型（reference type）,实例化一个对象时，实际创建了对该对象的引用（reference to the object ）
        //new Walrus constructor(构造函数)做两件事情：1.分配内存 2.在地址处放置海象
        //new 操作符返回地址
        //Walrus a 这个变量实际存储上面内存的地址 reference type
        Walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a);//会记录这个实例的地址
        System.out.println(b);

        int[] x=new int[]{1,2,3,4,5};//new关键字创建了5个32位的位箱，并返回整个对象的地址以分配给x。

        basic_code.IntNode L = new basic_code.IntNode(5, null);
        L.next = new basic_code.IntNode(10, null);
        L.next.next = new basic_code.IntNode(15, null);


    }

    public static class Walrus {
        public int weight;
        public double tuskSize;

        public Walrus(int w, double ts) {
            weight = w;
            tuskSize = ts;
        }
    }
}
