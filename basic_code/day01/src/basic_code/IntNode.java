package basic_code;
public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int f, IntNode r) {
        item = f;
        next = r;
    }
    /**使用递归（recursion）的方法返回列表大小*/
    public int size(){//
        if (next == null){
            return 1;
        }
        return 1+ this.next.size();
    }

    /*使用指针计算列表大小*/
    public int Pointersize(){
        int sum=0;
        IntNode p=this;
        while (p!=null){
            sum++;
            p=p.next;
        }
        return sum;

    }

    /*得到i th 个节点,使用递归*/
    public int get(int i){
        if (i==0) return this.item;
        return this.next.get(i-1);
    }

    public static void main(String[] args) {
        IntNode L = new IntNode(15,null);//从后往前构建链表，这是末尾节点 L->5->10->15,但是列表L从后往前构建
        L=new IntNode(10,L);
        L=new IntNode(5,L);
        System.out.println(L.size());
        System.out.println(L.Pointersize());
        System.out.println(L.get(1));

    }
}
