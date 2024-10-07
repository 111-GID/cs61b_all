package interface3;

public interface Comparator<T> {//对象不是DOG 而是一个狗比较器（如可能创建一个名字比较器）
    int compare(T o1,T o2);
}
