public class Sort {
    /** Sorts strings destructively. */

    private static void sort(String[] x, int start) {
        /**这种只需要考虑较大数组的子集的问题非常常见。一种典型的解决方案是创建一个私有辅助方法，该方法具有一个或多个附加参数，用于描述要考虑数组的哪一部分*/
        if(start ==x.length){
            return;
        }
        int smallestIndex = findSmallest(x,start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
        // TODO
    }
    public static void sort(String[] x) {
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
        sort(x, 0);
    }
    /** Returns the smallest string in x.
     * @source Got help with string compares from https://goo.gl/a7yBU5 . @source标签来引用我们的资料来源 */
    public static int findSmallest(String[] x,int start) {
        //return x[1];//先随便写
        int smallest=start;
        for ( int i=start ; i<x.length; i++){
            //str1.compareTo(str2)如果 ，该方法将返回负数str1 < str2，如果它们相等，则返回 0，如果 ，则返回正数str1 > str2
            int cmp=x[i].compareTo(x[smallest]);
            if(cmp<0){
                smallest=i;
            }
        }
        return smallest;

    }
    public static void swap(String[] x, int a, int b) {
        String temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
}