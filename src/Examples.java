import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
    public Examples() {}

    HeapChecker HeapChecker = new HeapChecker ();

    // Heaps
    IHeap emptyHeap = new MtHeap();

    IHeap dataHeap2 = new DataHeap(2,
            new DataHeap(7,
                    new DataHeap(15,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(18,
                            new MtHeap(), new MtHeap())),
            new DataHeap(19,
                    new MtHeap(), new MtHeap()));


    IHeap dataHeap3 = new DataHeap(4,
            new DataHeap(5,
                    new MtHeap(), new MtHeap()), new MtHeap());


    IHeap dataHeap4 = new DataHeap(2,
            new DataHeap(3,
                    new MtHeap(),
                    new DataHeap(32,
                            new MtHeap(), new MtHeap())),
            new DataHeap(4,
                    new MtHeap(), new MtHeap()));


    IHeap dataHeap5 = new DataHeap(5,
            new DataHeap(12,
                    new MtHeap(),
                    new DataHeap(30,
                            new MtHeap(), new MtHeap())),
            new DataHeap(15,
                    new MtHeap(), new MtHeap()));


    IHeap dataHeap6 = new DataHeap(2,
            new DataHeap(3,
                    new DataHeap(5,
                            new MtHeap(),new MtHeap()),new MtHeap()),
            new DataHeap(4,
                    new MtHeap(), new MtHeap()));


    IHeap dataHeap7 = new DataHeap(2,
            new DataHeap(3,
                    new DataHeap(5,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(6,
                            new MtHeap(), new MtHeap())),
            new DataHeap(4,
                    new DataHeap(7,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(100,
                            new MtHeap(), new MtHeap())));

    IHeap dataHeap8 = new DataHeap(9,
            new MtHeap(), new MtHeap());


    // Binary Trees
    IBinTree binTree1 = new DataHeap(3,
            new MtHeap(), new MtHeap());

    IBinTree binTree2 = new DataHeap(2,
            new DataHeap(7,
                    new DataHeap(15,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(18, new MtHeap(), new MtHeap())),
            new DataHeap(9,
                    new MtHeap(), new DataHeap(19,
                    new MtHeap(), new MtHeap())));

    IBinTree binTree3 = new DataHeap(8,
            new DataHeap(4, new MtHeap(), new MtHeap()),
            new DataHeap(5, new MtHeap(), new MtHeap()));

    IBinTree binTree4 = new DataHeap(2,
            new DataHeap(3,
                    new DataHeap(5,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(32,
                            new MtHeap(), new MtHeap())),
            new DataHeap(4,
                    new MtHeap(),
                    new DataHeap(5,
                            new MtHeap(), new MtHeap())));

    IBinTree binTree5 = new DataHeap(5,
            new DataHeap(12,
                    new DataHeap(15,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(30,
                            new MtHeap(), new MtHeap())),
            new DataHeap(15,
                    new MtHeap(),
                    new DataHeap(12,
                            new MtHeap(), new MtHeap())));


    IBinTree binTree6 = new DataHeap(1,
            new DataHeap(2,
                    new DataHeap(3,
                            new MtHeap(),new MtHeap()),
                    new DataHeap(4,
                            new MtHeap(), new MtHeap())), new MtHeap());


    IBinTree binTree7 = new DataHeap(3,
            new DataHeap(5,
                    new DataHeap(6,
                            new MtHeap(), new MtHeap()), new MtHeap()),
            new DataHeap(4,
                    new DataHeap(7,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(100,
                            new MtHeap(), new MtHeap())));


    IBinTree binTree8 = new MtHeap();


    IBinTree binTree9 = new DataHeap(4,
            new DataHeap(5,
                    new DataHeap(6,
                            new MtHeap(), new MtHeap()), new MtHeap()),
            new DataHeap(3,
                    new DataHeap(7,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(100,
                            new MtHeap(), new MtHeap())));


    IBinTree binTree10 = new DataHeap(3,
            new DataHeap(5,
                    new DataHeap(6,
                            new MtHeap(), new MtHeap()), new MtHeap()),
            new DataHeap(7,
                    new DataHeap(100,
                            new MtHeap(), new MtHeap()), new MtHeap()));

    IBinTree binTree11 = new DataHeap(2,
            new DataHeap(5,
                    new DataHeap(6,
                            new MtHeap(), new MtHeap()), new MtHeap()),
            new DataHeap(4,
                    new DataHeap(7, new MtHeap(), new MtHeap()),
                    new DataHeap(100, new MtHeap(), new MtHeap())));


    IBinTree binTree12 = new DataHeap(3,
            new DataHeap(5,
                    new MtHeap(), new MtHeap()),
            new DataHeap(4,
                    new DataHeap(7,
                            new MtHeap(), new MtHeap()),
                    new DataHeap(100, new MtHeap(), new MtHeap())));



//    addElt Tests
    @Test
    //adds to empty heap
    public void addEltTest1() {
        assertTrue(HeapChecker.addEltTester(emptyHeap,3, binTree1));
    }

    @Test
    public void addEltTest2() {
        assertTrue(HeapChecker.addEltTester(dataHeap2,9, binTree2));
    }

    @Test
    public void addEltTest3() {
        assertFalse(HeapChecker.addEltTester(dataHeap3,8, binTree3));
    }

    @Test
    public void addEltTest4() {
        assertFalse(HeapChecker.addEltTester(dataHeap4,5, binTree4));
    }

//    duplicate data value in heap
    @Test
    public void addEltTest5() {
        assertFalse(HeapChecker.addEltTester(dataHeap5,15, binTree5));
    }

    @Test
    public void addEltTest6() {
        assertFalse(HeapChecker.addEltTester(dataHeap6, 1, binTree6));
    }

//    remMinElt Tests

    @Test
    public void remMinEltTest1() {
        assertTrue(HeapChecker.remMinEltTester(dataHeap7, binTree7));
    }

    @Test
    public void remMinEltTest2() {
        assertTrue(HeapChecker.remMinEltTester(dataHeap8, binTree8));
    }

    @Test
    public void remMinEltTest3() {
        assertFalse(HeapChecker.remMinEltTester(dataHeap7, binTree9));
    }

    @Test
    public void remMinTest4() {
        assertFalse(HeapChecker.remMinEltTester(dataHeap7, binTree10));
    }

    @Test
    public void remMinEltTest5() {
        assertFalse(HeapChecker.remMinEltTester(dataHeap7, binTree11));
    }

    @Test
    public void remMinTest6() {
        assertFalse(HeapChecker.remMinEltTester(dataHeap7, binTree12));
    }
}