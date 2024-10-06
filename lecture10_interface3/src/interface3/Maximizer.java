package interface3;
public class Maximizer {
    //public static Object max(Object[] items){
    public static OurComparable max(OurComparable[] items){//应当将Object 替换为可比较对象
        int maxindex=0;
        for (int i = 0; i<items.length; i++){
            if(items[i].compareTo(items[maxindex])==1){
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
    System.out.print(maxDog.name);
    }
}

