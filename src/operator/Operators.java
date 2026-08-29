package operator;

public class Operators {
    //    public static void main(String[] args) {
//        int a = 10, b = 10, c = 10, d = 10;
//
//        System.out.println(a++);
//        System.out.println(++b);
//        System.out.println(--c);
//        System.out.println(d--);
//
//        a = 10;
//        b = 10;
//        c = 10;
//        d = 10;
//
//        b = ++a;
//        System.out.println("a=" + a + "b=" + b);
//
//        d = c++;
//        System.out.println("c=" + c + "d=" + d);
//    }
    public static void main(String[] args) {
        String s1 = "X";
        String s2 = s1 + "Y";
        System.out.println("s1=s2  : " + (s1 == s2));//false

        String s3 = "X";
        String s4 = s3.concat("Y");
        System.out.println("s3=s4   : " + (s3 == s4));//false

        StringBuilder s5 = new StringBuilder("X");
        StringBuilder s6 = s5.append("Y");//元コードに追加
        System.out.println("s5=s6  : " + (s5 == s6));//true
    }
}