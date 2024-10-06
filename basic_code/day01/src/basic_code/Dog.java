package basic_code;

public class Dog {//类有自己的变量，也称为实例变量或非静态变量。
    //Variables and methods of a class are also called members of a class.类的变量和方法也被称为类的成员（Members）
    /*
        d = new Dog();
        d.weightInPounds = 20;
        类的成员通过点号（dot notation）访问
     */
    public int weight;//instance variable
    public static String bioname = "Canis familiars";//static variable,这个类共有属性，永远不会变化

    public Dog(int w) {//Constructor(similar to method, but not method),determine how to instantiate the class
        /* 初始化，带有public Dog(int w)签名的构造函数会在我们使用一个整数参数创建Dog对象时被调用。
        对于Python用户，构造函数类似于__init__方法。
         */
        weight = w;
    }

    public void makeNoise() {//不能设置为static类型,Non-static method(instance method)
        if (weight > 30) {
            System.out.println("bark!");
        } else {
            System.out.println("woooo!");
        }

    }

    public static Dog maxDog(Dog d1, Dog d2) {//是静态方法(类方法)
        if (d1.weight > d2.weight) {
            return d1;
        } else {
            return d2;
        }
    }

    public Dog maxDog(Dog d2) {//是非静态方法（实例方法）
        if (weight > d2.weight) {
            return this;
        } else {
            return d2;
        }
    }
}
//如果方法需要使用 my instance variable,方法必须是 non-static