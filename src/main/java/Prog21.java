/**
 * クラス Prog21 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Prog21 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        String sikiA = "x+y = ";
        String sikiB = "y/x = ";
        System.out.println("x=" + 2 + ",y=" + 7 +"とすると、");
        System.out.println(sikiA + (int)x+y);
        System.out.println(sikiB + (double)y/x);
    }
}
