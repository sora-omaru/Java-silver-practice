package objectCalass;

public class Test {
    int instantVal = 100;
    static int staticVal = 200;

    void methodA() {
        System.out.println("methodA():" + instantVal);
    }

    static void methodB() {
        System.out.println("methodB():" + staticVal);
    }
}
