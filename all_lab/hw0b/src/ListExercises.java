import java.util.List;
import java.util.ArrayList;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum=0;
        for(int i:L){
            sum=sum+i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> l=new ArrayList<>();
        for(int i : L){
            if(i%2==0){
                l.add(i);
            }
        }
        return l;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> l=new ArrayList<>();
        for (int i : L1){
            for(int j:L2){
                if(i==j){
                    l.add(i);
                }
            }
        }
        return l;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int num=0;
        for(String i:words){
            for (int j=0;j<i.length();j++){
                if (c==i.charAt(j)){
                    num++;
                }
            }
        }
        return num;
    }
}
