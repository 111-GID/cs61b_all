package basic_code;
public class Main {
    public static void main(String[] args) {//使用另一个类的类叫做另一个类的client,如此main为Dog类的client
        System.out.println("Hello world!");
        Dog d = new Dog(10);//创建Dog对象（object）,叫做实例化instantiated,Here, the instantiation is parameterized
        d.makeNoise();

        Dog[] d2=new Dog[2];
        d2[0]= new Dog(12);
        d2[1]= new Dog(31);
        d2[1].makeNoise();

        Dog biggou=Dog.maxDog(d2[0],d2[1]);//是静态的，不需要特定狗判断
        biggou.makeNoise();
        Dog larger = d2[0].maxDog(d2[1]);//调用非静态方法
        larger.makeNoise();

    }
}