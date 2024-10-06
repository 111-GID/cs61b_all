package basic_code;

public class DLList<pineapple> {//有时无法确定传入的item 类型

    public class IntNode{
        public pineapple item;
        public IntNode next;
        public IntNode pre;
        public IntNode(pineapple i,IntNode n,IntNode p){
            this.item=i;
            this.next=n;
            this.pre=p;


        }
    }

    public static int size=0;
    private IntNode shaobin;
    public IntNode last=null;

    public DLList(pineapple x){
        size=1;
        shaobin=new IntNode(null,shaobin,shaobin);
        shaobin.next=new IntNode(x,shaobin,shaobin);
        shaobin.pre=shaobin.next;
        last=shaobin.next;
    }

    public void addFirst(pineapple x){

        IntNode p=new IntNode(x,shaobin.next,shaobin);
        shaobin.next.pre=p;
        shaobin.next=p;
        size++;

    }

    public pineapple getlast(){
        IntNode p=this.shaobin;
        while(p.next!=null){
            p=p.next;
        }
        return p.item;
    }

    public void addLast(pineapple x){
        IntNode p=new IntNode(x,null,null);
        p.pre=shaobin.pre;
        shaobin.pre.next=p;
        shaobin.pre=p;
        p.next=shaobin;
        size++;
        last=p;
    }

    public void removeLast(){
        size--;
        last=shaobin.pre.pre;
        last.next=shaobin;
        shaobin.pre=last;
    }

    public static void main(String[] args){
        DLList<Integer> s=new DLList<>(3);//告诉实际item为int类型
        //DLList<Integer> s=new DLList<Integer>(3);
        s.addLast(6);
        s.addFirst(4);
        s.addLast(12);
        s.removeLast();

        DLList<String> s2=new DLList<>("you");//告诉实际item为int类型
        //DLList<String> s2=new DLList<>("you");
        s2.addLast("hello");
        s2.addFirst("python");
        s2.addLast("java");
        s2.removeLast();
    }







}
