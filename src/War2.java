import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class War2 {
    public static void main(String[] args) {
        System.out.println(solution("Prespecialized"));
    }
    public static String solution(String str) {
        str=str.toUpperCase();
        String res="";
        //boolean exist=false;
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                res+="(";
            }
            else {
                res+=")";
            }
        }
        return res;
    }
}
