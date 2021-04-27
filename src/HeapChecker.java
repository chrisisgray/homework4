
import java.util.Collections;
import java.util.LinkedList;

public class HeapChecker {

    /**
     * checks whether the Binary Tree is valid after addElt() is used
     * checks if the binary tree is a heap( smallest number on top and left and right branches are heaps too)
     * after addElt is used the new heap must have all the elements in the original heap and add only 1 element
     * @param hOrig
     * @param elt
     * @param hAdded
     * @return boolean
     */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {

        LinkedList<Integer> original = hOrig.makeList();
        LinkedList<Integer> added = hAdded.makeList();
        original.add(elt);
        Collections.sort(original);
        Collections.sort(added);



        if(hAdded.isHeap() && (hOrig.size()+1 == hAdded.size()) && original.equals(added) ) {
            return true;
        }
        return false;

    }

    /**
     *checks whether the Binary Tree is valid after remMinElt is used
     * checks if the returned binary tree is a heap (smallest number on top and left and right branches are heaps too)
     * after remMinElt is used the new heap must have all the elements in the original heap except the one removed
     * @param hOrig
     * @param hRemoved
     * @return boolean
     */
    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
        LinkedList<Integer> original1 = hOrig.makeList();
        LinkedList<Integer> subtracted = hRemoved.makeList();

        if(hOrig.empty()){
            return true;
        }
        else {
            Collections.sort(original1);
            Collections.sort(subtracted);
            original1.remove(0);

            return (hRemoved.isHeap() && (hOrig.remMinElt().size() == hRemoved.size()) && original1.equals(subtracted));
        }

    }
}
