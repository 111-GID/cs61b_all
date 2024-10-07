package interface3;
public class Maximizer {
    //public static Object max(Object[] items){
    public static OurComparable max(OurComparable[] items){//应当将Object 替换为可比较对象
        int maxindex=0;
        for (int i = 0; i<items.length; i++){
            if(items[i].compareTo(items[maxindex])>0){
                maxindex=i;
            }
        }
        return items[maxindex];
    }
    public static void main(String args[]){
    Dog d1= new Dog("a",3);
    Dog d2= new Dog("b",15);
    Dog d3= new Dog("c",6);
    Dog [] dogs =new Dog[]{d1,d2,d3};
    Dog maxDog= (Dog) Maximizer.max(dogs);
    System.out.println(maxDog.name);

    //TRY Comparator
     Dog d4 = new Dog("kk",21);
     Dog d5 = new Dog("bc",98);

     NameComperator nc = new NameComperator();
     int cmp = nc.compare(d4,d5);
     if( cmp >0){
         d4.bark();
     }else{
         d5.bark();
     }

//     Dog.NameComperator1 nc1 = new Dog.NameComperator1();
//        int cmp1 = nc1.compare(d4,d5);
//        if( cmp1 >0){
//            d4.bark();
//        }else{
//            d5.bark();
//        }

        Comparator<Dog> nc1 =Dog.getNameComparator();
        int cmp1 = nc1.compare(d4,d5);
        if( cmp1 >0){
            d4.bark();
        }else{
            d5.bark();
        }

    }
}

