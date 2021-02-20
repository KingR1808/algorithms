public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFib(3));
        System.out.println(findFib(5));

        System.out.println(findFibEffective(100));
    }
    //naiv,slow
    private static long findFib(int num){
        if(num<=1)
            return num;
        return  findFib(num-1)+findFib(num-2);
    }
    //effective
    public static long findFibEffective(int num){
        long[] arr = new long[num + 1];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<=num;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[num];
    }
}
