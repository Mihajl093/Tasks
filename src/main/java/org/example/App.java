package org.example;

public class App
{
    public static void main( String[] args )
    {
        MyStack mStack = new MyStack(10);

        mStack.addElement(96);
        mStack.addElement(56);
        mStack.addElement(45);
        mStack.addElement(34);

        mStack.deleteElement();

        System.out.print("Stack: ");
        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
