package SwitchAndFor;

public class For {
    public static void main(String[] args) {
        for (int count = 0; count < 5; count++) {//式1をfor文外で定義した場合もそれを使用することができるため、省略も可能。
            System.out.println(count);//この中に式3の処理を含めば、そこも省略できる。
        }

        //拡張For文
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int count = 0; count < array.length; count++) {
            System.out.print(array[count] + " ");
        }
    }
}
