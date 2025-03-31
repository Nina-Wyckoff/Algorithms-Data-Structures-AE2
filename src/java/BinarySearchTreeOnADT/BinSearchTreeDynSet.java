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


    private int size(Node x){
        if (x == null){
            return 0;
        }
        return x.size;
    }

    //remove element x from S, if it is presen
    public void remove(HashSet<Node> setS, Node elementX){
        //probably search first
        try {
            search(setS,elementX);
           
            if(elementX.leftNode == null && elementX.rightNode == null){
                
                elementX.p.size -= 1;
                linkParentToChild(elementX, null);
                setS.remove(elementX);
    
            } else if(elementX.leftNode != null && elementX.rightNode != null){
                    
                        //find smallest node in x's righ subtree
                        Node successor = revealSuccessor(elementX);
                        if (successor != null){
                            elementX.key = successor.key;
                            remove(setS, successor);
                        }
            } else{
                elementX.p.size -=1;
                Node child = (elementX.leftNode != null) ? elementX.leftNode : elementX.rightNode;

                linkParentToChild(elementX, child);
                setS.remove(elementX);
                }
            

        } catch (Exception e) {
            System.out.println("Node not found");
        }
    }

    private Node revealSuccessor(Node elementX){
        if (elementX.rightNode == null){
            return null;
        } 
        Node successorNode = elementX.rightNode;
        while (successorNode.leftNode != null){
            successorNode = successorNode.leftNode;
        }
        return successorNode;
        
    }

    private void linkParentToChild(Node elementX, Node childNode){
        if (elementX.p != null){
            if(elementX.p.leftNode.equals(elementX)){
                elementX.p.leftNode = childNode;
            } else{
                elementX.p.rightNode = childNode;
            }
        } else {
            root = childNode;
        }
        if (childNode != null) {
            childNode.p = elementX.p;
        }
    }

    //check whether element x is in set S
    
    public boolean isElement(HashSet<Node> setS, Node elementX){
        try {
            if (search(setS, elementX) == null){
                return false;
            }
            return true;  
        } catch (Exception e) {
            return false;
        }


    }

    //check whether set S has no elements
    public boolean isEmpty(HashSet<Node> setS){
        if (size(root) == 0){
            return true;
        }
        return false;
        //get size of set
        //note: does a null root count? 
        //because if so then it would still be empty 
        //but the size method wouldn't reflect that
    }

    //return the number of elements of set S
    public int setSize(HashSet<Node> setS){
        return size(root);

    }

    // return the union of sets S and T
    public HashSet<Node> union(HashSet<Node> setS, HashSet<Node> setT){
        //hmmmm if this union also has to be in tree structure
        //that is a complicating factor
        //how can i make this dry?

        HashSet<Node> resultsSet = new HashSet<>();

        for (Node node :)
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

    public Node search(HashSet<Node> setS,Node node) throws NoSuchElementException{
        Node thisNode = root;

        while (thisNode != null){
            if (node.key == thisNode.key) {
                return thisNode;
            } else if(node.key < thisNode.key){
                thisNode = thisNode.leftNode;
            } else{
                thisNode = thisNode.rightNode;
            }
        }
        throw new NoSuchElementException("Node with key " + node.key + " not found");
    }

    }