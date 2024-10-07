package interface3;

public class Dog implements OurComparable<Dog> {//实际上一个类可以继承多个接口
    public String name;
    private int size;
    public Dog(String n ,int s){
        name=n;
        size=s;
    }
    @Override
    public int compareTo(Dog o){//如果没有使用Comparable<T>意味着它采用泛型类型，则必须是Object 而非Dog，public int compareTo(Object o)
//        Dog otherDog = (Dog) o;
//        if (this.size< otherDog.size){
//            return -1;
//        }
//        else if (this.size== otherDog.size){
//            return 0;
//        }
//        else{
//            return 1;
//        }
        return this.size-o.size;
    }
    public void bark(){
        System.out.println("I am " + name);
    }

//    public static class NameComperator1 implements Comparator<Dog>{//
//        @Override
//        public int compare(Dog o1 , Dog o2){
//            return o1.name.compareTo(o2.name);
//        }
    //}


        private static class NameComperator1 implements Comparator<Dog>{//从 public 改到 private 是JAVA的实现方法
        @Override
        public int compare(Dog o1 , Dog o2){
            return o1.name.compareTo(o2.name);
        }
    }

    public static Comparator<Dog> getNameComparator(){//不要求外界创建对象，而是给一个方法实现
        return new NameComperator1();
    }

}
