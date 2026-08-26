package arrays;

public class Arrays{
public static void main(String[] args){
    int[][] arrays = new int[3][2];//数値がないとコンパイルエラー
    arrays[0][0] = 10;
    arrays[0][1] = 20;

    arrays[1][0] = 30;
    arrays[1][1] = 40;

    arrays[2][0] = 50;
    arrays[2][1] = 60;

//    System.out.println(arrays[1][0]);

    for (int[] array :arrays){
        for (int value:array){
            System.out.println(value);
        }
    }
}
}