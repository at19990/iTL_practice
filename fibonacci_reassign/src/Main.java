import java.math.*;

public class Main {
    /*
    フィボナッチ数列を求め、改行区切りで出力
    */
    public static void main(String[] args) {

        int n = 50;

        BigInteger beforeLast = BigInteger.ZERO;
        BigInteger last = BigInteger.ZERO;

        for(int k = 1; k <= n; k++){
            if(k == 1){
                beforeLast = BigInteger.ONE;
                System.out.println(beforeLast);
            }else if(k == 2){
                last = BigInteger.ONE;
                System.out.println(last);
            }else{
                BigInteger output = beforeLast.add(last);
                System.out.println(output);
                beforeLast = last;
                last = output;
            }

        }
        //実行時間 6ms
    }
}
