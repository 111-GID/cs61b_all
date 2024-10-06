package basic_code;
//实现两个功能：1.旋转list   2.记录删除的list元素
public class RotatingSLList<pineapple> extends SLList<pineapple> {
    SLList<pineapple> lostitem;
    public RotatingSLList() {
        // 调用父类 SLList 的有参构造函数
        super();
        lostitem=new SLList<>();
    }

    public RotatingSLList(pineapple x) {
        // 调用父类 SLList 的有参构造函数
        super(x);//call SLList(x)
        lostitem=new SLList<>();
    }


    public void rotateRight() {
        pineapple x=super.removeLast();//否则会使用新定义的removelast
        AddFirst(x);
    }

    public void printLostItem(){
        lostitem.print();
    }

    @Override
    public pineapple removeLast(){
        pineapple item=super.removeLast();//super对父对象的引用
        lostitem.AddFirst(item);

        return item;
    }

    public static void main(String[] args){
        RotatingSLList<Integer> L=new RotatingSLList<>();
        L.AddFirst(4);
        L.AddFirst(8);
        L.AddLast(12);
        L.AddLast(7);
        L.print();
        L.rotateRight();
        L.rotateRight();
        L.print();
        L.removeLast();
        L.removeLast();
        L.print();
        L.lostitem.print();

    }


}
