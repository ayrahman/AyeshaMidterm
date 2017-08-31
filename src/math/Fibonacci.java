package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */
          System.out.println(fib(5));//1,1,2,3,4,5......40
    }
    public static int fib(int n){
        if(n <= 0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fib(n-1)+ fib(n-2);
        }
    }
}
