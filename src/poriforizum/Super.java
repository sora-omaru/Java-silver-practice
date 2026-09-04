package poriforizum;

class Parent {
    Parent() {
        System.out.println("親コンストラクタ");
    }

    void parentMethod() {
        System.out.println("親メソッド");
    }
}

class Child extends Parent {
    Child() {
        //super()これがコンパイル時に自動挿入
        System.out.println("子コンストラクタ");
    }

    void childMethod() {
        System.out.println("子メソッド");
    }
}

//public class Super {
//    public static void main(String[] args) {
//        Child c = new Child();
//        c.parentMethod();
//        c.childMethod();
//    }
//}
