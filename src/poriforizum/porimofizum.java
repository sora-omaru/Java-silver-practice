package poriforizum;

class Employee {
    private String id = "100";//スーパークラスの定義

    public String getId() {
        return id;
    }
}

class Sales extends Employee {
    private String clientName = "SE";//サブクラスの定義

    public String getClientName() {
        return clientName;
    }
}

public class porimofizum {
    public static void main(String[] args) {
        Sales s = new Sales();
        //サブクラスの呼び出し
        System.out.println("clientName　　　：" + s.getClientName());
        //サブクラスが継承しているメソッドの呼び出し
        System.out.println("id　　　：" + s.getId());

    }

}
