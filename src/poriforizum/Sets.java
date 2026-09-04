package poriforizum;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        String[] ary = {"CCC", "AAA", "BBB"};

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(ary[0]);
        hashSet.add(ary[1]);
        hashSet.add(ary[2]);
        hashSet.add(ary[0]);//定義しているが、hashSetのため重複を保持しない。

        System.out.println("HashSet size : " + hashSet.size());

        for (String str : hashSet) {
            System.out.print(str + " ");
        }

    }
}
