package BinarySearchTreeOnADT;

import java.util.HashSet;
import java.util.NoSuchElementException;

//implementation of DynSet Interface
//define BST Structure
//Node class?

public class BinSearchTreeDynSet implements DynamicSetADT<BinarySearchTreeOnADT.BinSearchTreeDynSet.Node>{

    private Node root; //root of Binary Search Tree

        protected class Node{
        private int key; //sort by key
        private Node leftNode, rightNode, p; //three slots
        private int size; //number of nodes

        public Node(int key, int size){
            this.key = key;
            this.size = size;
            this.leftNode = null;
            this.rightNode = null;
            this.p = null;
        }
    }
   
    public BinSearchTreeDynSet(){
        root = null;

    }
    
    

    //add element x to S, if it is not present already
    public void add(HashSet<Node> setS, Node elementX){

    }

    //remove element x from S, if it is presen
    public void remove(HashSet<Node> setS, Node elementX){
        
    }

    //check whether element x is in set S
    
    public boolean isElement(HashSet<Node> setS, Node elementX){
        
    }

    //check whether set S has no elements
    public boolean isEmpty(HashSet<Node> setS){
        
    }

    //return the number of elements of set S
    public int setSize(HashSet<Node> setS){
        
    }

    // return the union of sets S and T
    public HashSet<Node> union(HashSet<Node> setS, HashSet<Node> setT){
        
    }

    //return the intersection of sets S and T
    public HashSet<Node> intersection(HashSet<Node> setS, HashSet<Node> setT){
        
    }

    //returns the difference of sets S and T
    public HashSet<Node> differences(HashSet<Node> setS, HashSet<Node> setT){
        
    }

    //check whether set S is a subset of set T
    public boolean subset(HashSet<Node> setS, HashSet<Node> setT){
        
    }

    }