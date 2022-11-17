package org.example;

import junit.framework.TestCase;

public class MyStackTest extends TestCase {

    public void testAddElement() {
        MyStack mStack = new MyStack(10);
        mStack.addElement(96);
        mStack.addElement(56);
        mStack.addElement(45);
        mStack.addElement(34);
        int[] mas = new int[4];
        for (int i = 0; i < 4; i ++){
            mas[i] = mStack.readTop();
        }
        int[] m = {34, 45, 56, 96};
        assertArrayEquals(m, mas);
    }

    private void assertArrayEquals(int[] m, int[] mas) {
    }

    public void testDeleteElement() {
        MyStack mStack = new MyStack(10);
        mStack.addElement(96);
        mStack.addElement(56);
        mStack.addElement(45);
        mStack.addElement(34);
        mStack.deleteElement();
        int[] mas = new int[4];

        assertEquals(mStack.readTop(), 56);
    }

}
