package poriforizum;

class Foo {
    String str;
    int num;

    public Foo() {
        this("no_data");
    }

    public Foo(String str) {
        this(str, 1);
    }

    public Foo(String str, int num) {
        this.str = str;
        this.num = num;
        System.out.println("String  :" + this.str);
        System.out.println("num :" + this.num);
    }
}

public class Consta {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Foo("hey");
        Foo f3 = new Foo("Bye", 200);
    }
}
