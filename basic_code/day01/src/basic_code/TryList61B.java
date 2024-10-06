package basic_code;

public class TryList61B {
    public static String longest(List61B<String> list){//将例如ListArray 或者SLList 改为List61B
        int maxindex=0;
        for(int i = 0; i < list.size(); i += 1){
            String longestString=list.get(maxindex);
            String thisString = list.get(i);
            if(thisString.length()>longestString.length()){
                maxindex=i;
            }
        }
        return list.get(maxindex);

    }

    public static void main(String[] args){
//        ListArray<String> list= new ListArray<>();
        List61B<String> list= new ListArray<>();//两种创建方法都可以
        list.addfirst("hello");
        list.insert("toto",1);
        list.insert("maomao hhh",2);
        list.addlast("jojo");
        System.out.println(longest(list));//这样longest就可以接受 arraylist,sslist...
        list.print();
    }
}
