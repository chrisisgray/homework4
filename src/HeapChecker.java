import java.util.Collections;
import java.util.LinkedList;

public class HeapChecker {

    /**
     * checks whether the Binary Tree is valid after addElt() is used
     * checks if the binary tree is a heap(smallest number at the root, left and right branches are heaps too)
     * after addElt is used the new heap must have all the elements in the original heap and add only 1 element
     * @param hOrig original heap
     * @param elt element to add to the heap
     * @param hAdded heap with the added element
     * @return True if the original heap with the element added, is the same as the heap with the added element
     */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {

        LinkedList<Integer> original = hOrig.makeListOfElements();
        LinkedList<Integer> added = hAdded.makeListOfElements();
        original.add(elt);
        Collections.sort(original);
        Collections.sort(added);

        return (hAdded.isHeap() && (hOrig.size() + 1 == hAdded.size()) && original.equals(added));

    }

    /**
     * checks whether the Binary Tree is valid after remMinElt is used
     * checks if the returned binary tree is a heap (smallest number on top and left and right branches are heaps too)
     * after remMinElt is used the new heap must have all the elements in the original heap except the one removed
     * @param hOrig original heap
     * @param hRemoved heap with the removed element
     * @return True if the original heap with the element removed, is the same as one of the heaps with the removed element
     */
    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
        LinkedList<Integer> original = hOrig.makeListOfElements();
        LinkedList<Integer> removed = hRemoved.makeListOfElements();

        if(hOrig.isEmpty()){
            return true;
        }
        else {
            Collections.sort(original);
            Collections.sort(removed);
            original.remove(0);

            return (hRemoved.isHeap() && (hOrig.remMinElt().size() == hRemoved.size()) && original.equals(removed));
        }

    }
}
