package linkedIn;

public class LinkedInExe {
    public static void main(String[] args) {
       /* int array[] = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");*/

        Interface1.print();
        Interface2.print();
    }
}

interface Interface1 {
    static void print() {
        System.out.print("Hello");
    }
}

interface Interface2 {
    static void print() {
        System.out.print("World!");
    }
}