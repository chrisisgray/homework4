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
 boolean smallerRoot(int a);
 //makes a list for given tree
 LinkedList<Integer> makeList();
 //checks if the list is empty
 boolean empty();
}

