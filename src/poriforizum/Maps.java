package poriforizum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "AAA");
        map.put(1, "BBB");
        map.put(2, "AAA");//値の重複
        map.put(1, "CCC");//キーの重複、上書きする

        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }

        System.out.println();

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {//keyの呼び出し
            System.out.print(key + " ");
        }
        System.out.println();

        Collection<String> values = map.values();//値の集合(コレクション)を取得するvalueメソッドを使用する。
        for (String value : values) {
            System.out.print(value + " ");
        }
    }
}
