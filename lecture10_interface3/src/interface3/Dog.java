package interface3;

public class Dog implements OurComparable {//实际上一个类可以继承多个接口
    public String name;
    private int size;
    public Dog(String n ,int s){
        name=n;
        size=s;
    }
    @Override
    public int compareTo(Object o){//必须是Object 而非Dog
        Dog otherDog = (Dog) o;
//        if (this.size< otherDog.size){
//            return -1;
//        }
//        else if (this.size== otherDog.size){
//            return 0;
//        }
//        else{
//            return 1;
//        }
        return this.size-otherDog.size;
    }
}
