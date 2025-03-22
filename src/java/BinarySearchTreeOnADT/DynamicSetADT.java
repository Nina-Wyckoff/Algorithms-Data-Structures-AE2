package BinarySearchTreeOnADT;


import java.util.HashSet;

public interface DynamicSetADT<T> {


    //add element x to S, if it is not present already
    public void add(HashSet<T> setS, T elementX);

    //remove element x from S, if it is presen
    public void remove(HashSet<T> setS, T elementX);

    //check whether element x is in set S
    public boolean isElement(HashSet<T> setS, T elementX);

    //check whether set S has no elements
    public boolean isEmpty(HashSet<T> setS);

    //return the number of elements of set S
    public int setSize(HashSet<T> setS);

    // return the union of sets S and T
    public HashSet<T> union(HashSet<T> setS, HashSet<T> setT);

    //return the intersection of sets S and T
    public HashSet<T> intersection(HashSet<T> setS, HashSet<T> setT);

    //returns the difference of sets S and T
    public HashSet<T> differences(HashSet<T> setS, HashSet<T> setT);

    //check whether set S is a subset of set T
    public boolean subset(HashSet<T> setS, HashSet<T> setT);
}
