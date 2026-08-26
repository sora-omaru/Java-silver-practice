package variables;

public class Variables {
//    public static void main(String[] args){
//        System.out.println(255);
//        System.out.println(0b11111111);
//        System.out.println(0377);
//        System.out.println('A');
//        System.out.println("Hello");
//        System.out.println(false);
//    }

//    public static void main(String[] args){//変数を定義voidもデータ型
//        int num1 = 1;//初期化
//        num1 = 10;//代入
//
//        final long num2 = 200;//定数化
////        num2 = 20;定数のため代入できない
//
//        float num3 = 10.3F;//少数点はfloatです
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//    }
////    System.out.println(num2);変数のスコープでこちらは参照できない。コンパイルエラーになります。
///
/// これはローカルスコープ外であるため、コンパイルエラー
//    var num1 = 10;
    public static void main(String[] args){
        var C = "hello";
        final var N = 10;//これは大丈夫！
    }
}
