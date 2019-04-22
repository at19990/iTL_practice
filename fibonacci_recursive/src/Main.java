import java.math.BigInteger;

public class Main {
    /*
    フィボナッチ数列を求め、改行区切りで出力
    */
    public static BigInteger function(int n){

        if((n ==1) || (n == 2)){
            return BigInteger.ONE;
        }else{
            return function(n - 1).add(function(n - 2));
        }
    }
    public static void main(String[] args) {

        int n = 50;

        for(int k = 1; k <= n; k++){
            BigInteger result = function(k);
            if(k < n){
                System.out.print(result + ", \n");
            }else{
                System.out.print(result);
            }
        }

    }

}
