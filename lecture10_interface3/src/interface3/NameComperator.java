package interface3;

public class NameComperator implements Comparator<Dog>{//如果认为是Dog的特有属性，则写到Dog的嵌套类中
    @Override
    public int compare(Dog o1 , Dog o2){
        return o1.name.compareTo(o2.name);
    }
}
