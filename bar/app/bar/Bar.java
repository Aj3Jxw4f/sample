package bar;

import foo.Foo;

public class Bar {
    public static void main(String[] args) {
        System.out.println("Fooクラスのインポート確認 -> " + Foo.message());
    }
}
