import java.math.*;

public class Main {
    /*
    ネイピア数を1000桁求める
     */
    public static BigDecimal function(int i){

        BigDecimal n = BigDecimal.valueOf(i);

        if (i == 0){
            //0! = 1
            return BigDecimal.ONE;
        }else{
            /*
            再帰:エクセルの計算と同様に、1つ前の項に(1/n)をかける
            小数点以下1010桁まで求めて丸める
             */
            return function(i - 1).divide(n, 1010, RoundingMode.HALF_UP);
        }

    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BigDecimal napier = BigDecimal.ZERO;

        for(int i = 0; i <= 450; i ++){
            /*
            i < 450 では精度が不十分だった ( http://www.tamagaki.com/math/e10000.html で確認)
            i >= 450 では10000まで増加させても、小数点以下1000桁はほぼ変化しなかった
             */
            napier = napier.add(function(i));
        }
        //小数点以下1001~1010桁を切り捨て
        BigDecimal output = napier.setScale(1000, RoundingMode.DOWN);

        System.out.println(output.toPlainString());

        //実行速度 197ms
    }

}
