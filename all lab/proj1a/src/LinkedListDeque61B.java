//We also want to tell Java that every LinkedListDeque61B is a Deque61B
//so that users can write code like Deque61B<String> lld1 = new LinkedListDeque61B<>();
//但是，这会产生错误。为了使 LinkedListDeque61B 成为 Deque61B，它需要实现所有 Deque61B 方法。
//但是，将鼠标悬停在红色曲线上，然后在弹出错误消息框时单击“实现方法”按钮。这将为您自动生成方法标头

import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T>{

    public  LinkedListDeque61B() {

}

    @Override
    public void addFirst(T x) {

    }

    @Override
    public void addLast(T x) {

    }

    @Override
    public List<T> toList() {
        return List.of();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
}
