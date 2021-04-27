import java.util.LinkedList;

public class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }

    //checks if the given tree is a heap
    public boolean isHeap(){
        if (left.smallerRoot(this.data) && right.smallerRoot(this.data)){
            return left.isHeap() && right.isHeap();
        }
        return false;
    }
    //checks if the given int is smaller than data
    public boolean smallerRoot (int e){
        return data >= e;
    }

    // creates list from the given tree
    public LinkedList<Integer> makeList() {
        LinkedList<Integer> result = new LinkedList<Integer>();
        result.add(this.data);
        result.addAll(this.right.makeList());
        result.addAll(this.left.makeList());
        return result;
    }

    //checks if its empty
    public boolean empty() {
        return false;
    }
}