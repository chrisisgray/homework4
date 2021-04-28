import java.util.LinkedList;

public interface IBinTree {
 // determines whether element is in the tree
 boolean hasElt(int e);
 // returns number of nodes in the tree; counts duplicate elements as separate items
 int size();
 // returns depth of longest branch in the tree
 int height();
 //checks if tree is heap
 boolean isHeap();
 //checks if the given integer is smaller than the data
 boolean smallerRoot(int e);
 //makes a list for given tree
 LinkedList<Integer> makeListOfElements();
 //checks if the list is empty
 boolean isEmpty();
}

