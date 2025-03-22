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
        Node elementY = null;
        Node elementZ = root;
        
        while (elementZ != null){
            
            elementY = elementZ;
            elementY.size += 1;
            
            if (elementX.key < elementZ.key){
                elementZ = elementZ.leftNode;
            }
            else{
                elementZ = elementZ.rightNode;
            }
        }
        elementX.p = elementY;
        elementX.size = 1;
        if (elementY == null){
            root = elementX;
        }
        else{
            if (elementX.key < elementY.key){
                elementY.leftNode = elementX;
            }
            else{
                elementY.rightNode = elementZ;
            }
        }
    }

    //remove element x from S, if it is presen
    public void remove(HashSet<Node> setS, Node elementX){
        //probably search first
        //i have to remove it without cutting off the children
        //i link elementX's children to elementX's parent
        //i remove elementX from the hashset
    }

    //check whether element x is in set S
    
    public boolean isElement(HashSet<Node> setS, Node elementX){
        //if search returns null/the excetion, return false
        //return true
    }

    //check whether set S has no elements
    public boolean isEmpty(HashSet<Node> setS){
        //get size of set
        //note: does a null root count? 
        //because if so then it would still be empty 
        //but the size method wouldn't reflect that
    }

    //return the number of elements of set S
    public int setSize(HashSet<Node> setS){
        //ummmmm modified search, i do a counter instead of storing nodes
        //can i use size method? is that the much simpler answer?
    }

    // return the union of sets S and T
    public HashSet<Node> union(HashSet<Node> setS, HashSet<Node> setT){
        //hmmmm if this union also has to be in tree structure
        //that is a complicating factor
        //how can i make this dry?
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

    private Node search(HashSet<Node> setS,Node node) throws NoSuchElementException{

    }

    }