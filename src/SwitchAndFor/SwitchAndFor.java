package SwitchAndFor;

public class SwitchAndFor {

    public static void main(String[] args) {
//        int num = 1;
//
//        while (num < 5) {
//            System.out.println(num);
//            num++;//5になるまで処理を行います
//        }
//        do {
//            System.out.println(num);
//            num++;
//        } while (num < 5);//4以上になるのであれば処理を終了する。


        //制御文のネスト
//        for (; num < 10; num++) {
//            if ((num % 4) == 0) {
//                System.out.println(num + "は4の倍数です");
//            }
//        }

//        for (int i = 0; ; i++) {
//            if (i == 3) {
//                break;//ここでifから抜けるのではなく、forから抜けます
//            }
//            System.out.println(i);
//        }
//


        for (int num = 0; num < 10; num++) {
            if ((num % 3) == 0) {
                System.out.println("処理をスキップするよ");
                continue;
            }
            System.out.println(num);
        }

        System.out.println("for文の後の処理");
    }
}
