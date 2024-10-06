package basic_code;

public class ListArray<pineapple> implements List61B<pineapple>{
    private pineapple[] item;//外部不关心是否使用数组
    private int size;

    public ListArray(){
        //item=new pineapple[100];//会报错
        item = (pineapple[]) new Object[100];
        size=0;
    }
    @Override//标记为被重写的插入方法，由于父接口有一个空白的插入方法,如果没有正确重写会报错
    public void insert(pineapple x,int i){
        pineapple[] newitem=(pineapple[]) new Object[item.length+1];
        System.arraycopy(item,0,newitem,0,i);
        newitem[i]=x;
        System.arraycopy(item,i,newitem,i+1,size-i);
        item=newitem;
        size++;
    }

    /** resize the array to the target capacity */
    private void resize(int capacity){
        if(capacity<size){
            System.out.println("wrong");
            return;
        }
        pineapple[] a=(pineapple[]) new Object[capacity];
        System.arraycopy(item,0,a,0,size);
        item=a;
    }

    @Override
    public void addfirst(pineapple x){
        if(size==item.length){
            resize(size*2);//每次加1会在要加入很多，变慢
        }
        insert(x,0);
    }

    @Override
    public void addlast(pineapple x){
        if(size==item.length){
            resize(size*2);//每次加1会在要加入很多，变慢
        }
        this.item[this.size]=x;
        size++;
    }

    @Override
    public pineapple getlast(){
        return item[size-1];
    }

    @Override
    public pineapple get(int i){
        return item[i];
    }

    @Override
    public int size(){
        return size;
    }
}
