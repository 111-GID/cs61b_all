package basic_code;

public class SLList<pineapple>  {

    public class IntNode {//类中还可以有类 nested class definition 也可以为 private class IntNode
        public pineapple item;
        public IntNode next;

        public IntNode(pineapple f, IntNode r) {
            item = f;
            next = r;
        }
    }
    public int len=0;
    //public IntNode first;
    private IntNode shaobin;//不允许访问 first 命令
    /*例如出现
    SLList L=SLList(3);
    L.AddFirst(10);
    L.first.next.next=L.first.next;//出现自己指向自己
     */
    public SLList(){
        shaobin =new IntNode(null,null);
        len=0;
    }

    public SLList(pineapple x){
        IntNode p=new IntNode(x,null);
        shaobin =new IntNode(null,p);

        len=1;
    }

    /*add x front of list*/
    public void AddFirst(pineapple x){
        IntNode p= new IntNode(x,shaobin.next);
        shaobin.next=p;
        len++;
    }
    /*get the first item in the list*/

    public pineapple GetFirst(){
        return shaobin.next.item;
    }

    public void AddLast(pineapple x){
        IntNode p=shaobin;
        while(p.next !=null){
            p = p.next;}
        p.next=new IntNode(x,null);
        len++;
    }

    public int size(){
        return size(shaobin.next);
    }
    //从IntNode p开始计算长度

    private int size(IntNode p){
        if (p.next==null){
            return 1;
        }
        return 1+size(p.next);
    }

    public pineapple removeLast(){
        IntNode p=shaobin;
        while(p.next.next !=null){
            p = p.next;}
        pineapple x = p.next.item;
        p.next=null;
        return x;
    }

    public void print(){
        IntNode p=shaobin;
        while(p.next !=null){

            p = p.next;
            System.out.print(p.item+" ");}
        System.out.println();

    }


    public static void main(String[] args){
        SLList<Integer> L=new SLList<>();
        L.AddFirst(2);
        L.AddLast(4);
        L.AddLast(7);
        L.print();
        System.out.println( L.GetFirst());
        System.out.println( L.len);
        System.out.println( L.size());
    }

}
