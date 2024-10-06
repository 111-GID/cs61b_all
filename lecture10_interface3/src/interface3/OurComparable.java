package interface3;
//放置所有可比较对象的集合

/**
 * return -1 if I am less than o
 * return 0 if I am equal to o
 * return 1 if I am larger than o
 *
 */
public interface OurComparable {
    public int compareTo(Object o);
}
