package poriforizum;

class SuperA {
    public void print(String s) {//スーパークラス
        System.out.println("SuperA print:" + s);
    }

    public void method() {
    }
}

class Sub extends SuperA {//サブクラス
    @Override
    public void print(String s) {
        s = "渡された文字は " + s + "です";
        System.out.println(s);
    }
//    void method(){}コンパイルエラー
}

public class OverrideMM {
    public static void main(String[] args){
        SuperA obj1 = new SuperA();//スーパークラスのインスタンス化
        obj1.print("Java");//スーパークラスのprintを呼び出す

        Sub obj2 = new Sub();//サブクラスのインスタンス化
        obj2.print("override");//サブクラスがスーパークラスを継承し、そのメソッドをオーバーライドしたprint
    }
}
