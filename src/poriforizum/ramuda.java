package poriforizum;

import java.util.function.Function;

public class ramuda {
    public static void main(String[] args) {
//        Function<String, String> obj = (String str) -> {
//            return "Hello " + str;
//        };
//        String str = obj.apply("tanaka");
//        System.out.println(str);

//        ラムだ式を利用して省略したもの
        Function<String, String> obj = str -> "Hello " + str;
        String str = obj.apply("ramda");
        System.out.println(str);

    }
}
