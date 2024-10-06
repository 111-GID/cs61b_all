package basic_code;

//建立 各种list的普遍接口
public interface List61B<pineapple> {
    //直接从listarray复制代码

    //不是所有list都需要数组与size
//    private pineapple[] item;//外部不关心是否使用数组
//    private int size;

//    public ListArray(){
//        //item=new pineapple[100];//会报错
//        item = (pineapple[]) new Object[100];
//        size=0;
//    }

    public void insert(pineapple x,int i);

    /** resize the array to the target capacity */
//    private void resize(int capacity){
//        if(capacity<size){
//            System.out.println("wrong");
//            return;
//        }
//        pineapple[] a=(pineapple[]) new Object[capacity];
//        System.arraycopy(item,0,a,0,size);
//        item=a;
//    }

    public void addfirst(pineapple x);

    public void addlast(pineapple x);

    public pineapple getlast();

    public pineapple get(int i);

    public int size();

    //还可直接写方法,sllist调用此方法效率很低，可以重写
    default public void print(){
        for (int i = 0;i < size(); i++){
            System.out.println(get(i)+" ");
        }
    }

}
