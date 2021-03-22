package main;

// chap05
// code05-01 シンプルなメソッドの定義
//public class Main {
//    public static void hello() {
//        System.out.println("湊さん、こんにちは");
//        }
//}

// chap05
// code05-02 メソッドの呼び出し
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("メソッドを呼び出します");
//        hello();
//        System.out.println("メソッドの呼び出しが終わりました");
//    }
//    public static void hello() {
//        System.out.println("湊さん、こんにちは");
//    }
//}

// code05-03 Mainメソッド以外からのメソッドを呼び出す
//public class Main {
//    public static void methodA() {
//        System.out.println("methodA");
//        methodB();
//    }
//    public static void methodB() {
//        System.out.println("methodB");
//    }
//
//    public static void main(String[] args) {
//        methodA();
//    }
//}

// code05-04 Mainメソッド以外からのメソッドを呼び出す
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("メソッドを呼び出します");
//        hello("湊");
//        hello("朝香");
//        hello("菅原");
//        System.out.println("メソッドの呼び出しが終わりました");
//    }
//    public static void hello(String name) {
//        System.out.println( name + "さん、こんにちは" );
//    }
//}

// code05-05 引数の例(渡す値が複数の場合)
//public class Main {
//
//    public static void main(String[] args) {
//        add(100, 20); // 実引数(渡す値) 100 20 を記述
//        add(200, 50); // 実引数(渡す値) 200 50 を記述
//    }
//    // 複数の値を受け取るaddメソッド メソッドの引数リストに型(ここではint型)と仮引数(受け取る変数名。ここではx, y)を記述
//    public static void add(int x, int y) {
//        int ans = x + y;
//        System.out.println( x + "+" + y + "=" + ans ); // 実行結果: 100+20=120 200+50=250
////        System.out.println( "x + y = " + ans ); // 実行結果: x + y = 120 x + y = 250
//    }
//}

// code05-06 引数を使わずにできないのか？
//public class Main {
//    public static void main(String[] args) {
//        int x = 100;
//        int y =10;
//        add();
//    }
//    public static void add(); {
//        int ans = x + y; // コンパイルエラーになる
//        // main()メソッド内で定義した変数xとy(ローカル変数)をmain()メソッドの外からは見つけられず利用できない
//        // エラーメッセージ
//        // java: メソッド本体がないか、abstractとして宣言されています
//        System.out.println( x + "+" + y + "=" + ans );
//    }
//}

// code05-07 戻り値の例
//public class Main {
//
//    // add()メソッドを定義し戻り値を(変数に)返す
//    public static int add(int x, int y) {
//        int ans = x + y;
//        return ans; // 戻り値をansに返す
//    }
//
//    public static void main(String[] args) {
//        // メソッドを呼び出し、戻り値を(変数で)受け取る: 型 変数名 = メソッド名(引数リスト);
//        int ans = add(100, 10); // 実引数に100, 10 を持つadd()メソッドが、return文によって評価されて戻ってきた値に置き換わり、int型の変数ansに戻る
//        System.out.println("100 + 10 = " + ans); // 実行結果: 100 + 10 = 110
//    }
//}

// code05-08 戻り値をそのまま使う
//public class Main {
//
//    public static int add(int x, int y) {
//        int ans = x + y;
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        System.out.println( add( add(10, 20), add(30, 40) ) ); // 実行結果: 100
//    }
//}

// code05-09 誤ったreturn文
//public class Main {
//
//    public static int sample() {
//        return 1; // return文は値を戻して、メソッドの終了も行う
//        int x = 10; // この文が実行されることはないのでコンパイルエラーになる
//        // エラーメッセージ
//        // java: この文に制御が移ることはありません
//        // java: return文が指定されていません
//    }
//
//    public static void main(String[] args) {
//        System.out.println("テスト");
//    }
//}

// code05-10 オーバーロード(多重定義) (引数の型が頃なる場合)
// 仮引数が異なれば同じ名前のメソッドを複数定義することが許される
//public class Main {
//    // 1つ目のaddメソッド(int型)
//    public static int add(int x, int y) {
//        return x + y;
//    }
//    // 2つ目のaddメソッド(double型)
//    public static double add(double x, double y) {
//        return x + y;
//    }
//    // 3つ目のaddメソッド(String型)
//    public static String add(String x, String y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(add(10, 20)); // 1つ目のaddメソッドが呼び出される
//        System.out.println(add(3.5, 2.7)); // 2つ目のaddメソッドが呼び出される
//        System.out.println(add("Hello", "World")); // 3つ目のaddメソッドが呼び出される
//    }
//}

// code05-11 オーバーロード(引数の数が異なる場合)
// 仮引数が同じ型を持つ同じ名前のメソッドでも、仮引数の個数が異なる場合はオーバーロードできる
//public class Main {
//    // 1つ目のaddメソッド(int型)
//    public static int add(int x, int y) {
//        return x + y;
//    }
//    // 2つ目のaddメソッド(int型)
//    public static int add(int x, int y, int z) {
//        return x + y + z;
//    }
//
//    public static void main(String[] args) {
//        System.out.println( "10+20=" + add(10, 20) ); // 1つ目のaddメソッドが呼び出される
//        System.out.println( "10+20+30=" + add(10, 20, 30) ); // 2つ目のaddメソッドが呼び出される
//    }
//}

// code05-12 引数に配列を用いる
//public class Main {
//
//    // メソッドの引数リストにint型配列を指定
//    public static void printArray(int[] array) {
//        // 配列arrayの値を1周するごとにelementに渡す
//        for (int element : array) {
//            // elementを画面に表示する
//            System.out.println(element);
//        }
//    }
//
//    public static void main(String[] args) {
//        // int型配列arrayに実引数を代入
//        int[] array = { 1, 2, 3};
//        // printArrayメソッドを呼び出す
//        // プリミティブ型(基本データ型)の変数intでも配列の場合は[値渡し]ではなく[参照の値渡し]になる
//        printArray(array);
//        // 実行結果:
//        // 1
//        // 2
//        // 3
//    }
//}

// code05-13 同じ配列を参照していることを確認する
//public class Main {
//
//    // int型配列を受け取り、配列ないの要素全てに1を加えるメソッド
//    public static void incArray(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            array[i]++; // 呼び出し先のメソッドでの変更が、呼び出し元に影響を与えるかの確認用の処理
//        } // 計算結果をreturn で返していない
//    }
//
//    public static void main(String[] args) {
//        // int型配列arrayに実引数を代入
//        int[] array = { 1, 2, 3};
//        // プリミティブ型(基本データ型)の変数intでも配列の場合は[値渡し]ではなく[参照の値渡し]になる
//        incArray(array); // メソッド実行
//
//        // arrayの全要素を出力
//        for (int i : array) {
//            System.out.println(i);
//        }
//        // 実行結果:
//        // 2
//        // 3
//        // 4
//        // 呼び出し先のメソッドでの変更が、呼び出し元に影響を与えている
//    }
//}

// code05-14 戻り値が配列の場合
public class Main {

    public static int[] makeArray(int size) {

        int[] newArray = new int[size];

        for (int i =0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] array = makeArray(3);

        for (int i : array) {
            System.out.println(i);
        }
        // 実行結果: 0 1 2
    }
}