import java.util.Arrays;
import java.util.Optional;

public class War {
    public static void main(String[] args) {
        /*Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for (int i=0;i<arr.length;i++){

        }*/
        /*boolean a=true;
        boolean b=false;
        boolean c;
        c=a^b;//(c равно true, если либо a, либо b (но не одновременно) равны true, иначе c будет равно false)
        System.out.println(c);*/
        //
        /*int check=1;
        int check2=2;
       switch (check){
           case 2:
               System.out.println("2");
               break;
           case 3:
               System.out.println("3");
               break;
           default:
               System.out.println("def");
       }
       int check3=check>check2 ? (check+check2):(check-check2);
       int[] arr={1,2,3};
        int length =arr.length;
        */
        //kata
        /*double x=0;
        int sto=100,sec=360;
        int res;
        res = (int) (((x*sto)/sec)*sto);
        System.out.println(res);*/
        ////
        //array
        ////
        /*int[] arr={1,1,3,1,1};
        String res=weatherInfo(50);
        System.out.println(res);*/

        /*int[][]arr={{1,1,1},{2,2,2}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/
        //foreeach
        /*int[] array={1,2,3,4,5,6,7,8};
        for (int i:array
             ) {
            System.out.println(array[i]);
        }*/

        /*int res=test(14.25);
        System.out.println(res);*/

        /*дейкстра*/
        /* Scanner in=new Scanner(System.in);
        char key;
        for (;;){
            key=in.next().charAt(0);
            switch (key){
                case 'l':
                    System.out.println("left");
                    continue;
                case 'r':
                    System.out.println("right");
                    continue;
            }
            break;
        }*/
        //end

    }

   /* public static boolean solution(String str, String ending) {
        if (str.length()<ending.length()) return false;
        String res=str.substring(str.length()-ending.length());
        if (res.equals(ending)) return true;
        return false;
    }
    */
    /*public static int findShort(String s) {
        String[] arr= s.split(" ");
        int min=0;
        for (int i = 0; i < arr.length ; i++)
            if(i< arr.length-1&&arr[i].length()>arr[i+1].length())
                min=i+1;
        int res=arr[min].length();
        return res;
    }*/
    /*
    public static int[] minMax(int[] arr) {
        OptionalInt min= Arrays.stream(arr).min();
        OptionalInt max=Arrays.stream(arr).max();
        return new int[] {min.getAsInt(),max.getAsInt()};
    }
    */
    /*public static int solve(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==-arr[j]) count++;
            }
            if(count==0) return arr[i];
        }
        return 0;
    }*/
    /*public static int nbYear(int p0, double percent, int aug, int p) {
        int res= (int)(p0+(p0*percent/100)+aug);
        int count=0;
        for (;;){
            count++;
            if (res>=p) break;
            else res= (int)(res+(res*percent/100)+aug);
        }
        return count;
    }*/
    /*public static boolean validatePin(String pin) {
        *//*if (pin.length()==4||pin.length()==6) {
            for (int i = 0; i <pin.length() ; i++) {
                if (pin.matches("^[0-9]"))
                    continue;
                else
                    break;
            }
            return true;
        }*//*
        //alternative
        if (pin.length()==4||pin.length()==6)
            if(pin.matches("^[0-9]+")) return true;
        return false;
    }*/
   /* public static int repeats(int [] arr){
        int count=0,res=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count<2)
                res+=arr[i];
            count=0;
        }
        return res;
    }*/
    /*public static String maskify(String str) {
        String res="";
        if (str.length()<=4) res=str;
            else {
            for (int i = 0; i <str.length(); i++) {
                if(str.length()-4>i){
                    res+="#";
                    continue;
                }
                res+=str.charAt(i);
            }
        }
            return res;
        //throw new UnsupportedOperationException(res);
    }*/
    /*public static int GetSum(int a, int b)
    {
        int res=0;
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;
        while (min<=max){
            res+=min;
            min++;
        }
        return res;
    }*/
   /* public static int rowSumOddNumbers(int n) {
        int res=0,rescount=0,sum=0;
        for (int i = 0; i <n ; i++) res+=i;
        for (int i = 0; i <res*2; i++) {
            if (i %2==0) continue;
            else rescount=i;
        }
        for (int i=0; i <n; ) {
            rescount++;
            if(rescount%2!=0) {
                sum += rescount;
                i++;
            }
        }
        return sum;
    }
    */

    /*public static int sortDesc(final int num) {
        String str=String.valueOf(num),res="";
        int[]arr=new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        Arrays.sort(arr);
        for (int i = 0; i < str.length() ; i++)
            res+=String.valueOf(arr[i]);
        return  Integer.parseInt(new StringBuilder(res).reverse().toString());
    }*/
    /*public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        String res="";
        for (int i = 0; i < binary.size(); i++) res+=binary.get(i);
        return Integer.parseInt(res,2);
    }*/

    /*public static String str(String s){
        String res="";
        for (int i = 0; i < s.length(); i++) {
            res+=""+s.toUpperCase().charAt(i);
            for (int j = 0; j < i; j++) {
                res+=""+s.toLowerCase().charAt(i);
            }
            if(i<s.length()-1)res+="-";
        }
        return res;
    }*/
   /* public static String minMax(String numbers){
        String[] num=numbers.split(" ");
        int max=Integer.parseInt(num[0]),min=Integer.parseInt(num[0]);
        for (int i = 0; i < num.length; i++) {
            if (Integer.parseInt(num[i])>max) max=Integer.parseInt(num[i]);
            if (Integer.parseInt(num[i])<min) min=Integer.parseInt(num[i]);
        }
        return String.valueOf(max)+" "+String.valueOf(min);
    }*/

    /*public static String minMax(String numbers){
        String[] num=numbers.split(" ");
        int[] array = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
        OptionalInt max= Arrays.stream(array).max();
        OptionalInt min=Arrays.stream(array).min();
        String res=String.valueOf(max.getAsInt())+" "+String.valueOf(min.getAsInt());
        return res;
    }*/

    /*0.0*/
   /* public static boolean isSquare(int n){
        if(Math.sqrt(n)-(int)Math.sqrt(n)==0.0)
            return true;
        return false;
    }*/

    /*public static int square(int num){
        String res="";
        String cast=""+num;
        for (int i = 0; i <cast.length() ; i++) {
            res+=""+(int)Math.pow(Integer.parseInt(String.valueOf(cast.charAt(i))),2);
        }
        return Integer.parseInt(res);
    }*/

    /*A, E, I, O, U*/
    /*public static String remove(String str){
        String res="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u')
                continue;
            else
                res+=str.charAt(i);
        }
        return res;
    }*/
   /* public static int test(double col) {
        return (int)col/2;
    }*/
    /*public static String weatherInfo(int temp) {
        float c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static float convertToCelsius(int temperature) {
        float celsius = (float) ((temperature - 32) * (5.0/9.0));
        return celsius;
    }*/

}
