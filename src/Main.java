import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the problem:");
        int problem = sc.nextInt();
        if (problem == 1) {
            long startTime = System.nanoTime();

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("result: " + findmin(arr) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        } else if (problem == 2) {
            long startTime = System.nanoTime();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            double average = findaverage(arr);
            System.out.println("result: " + findaverage(arr) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        } else if (problem == 3) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }
            long startTime = System.nanoTime();
            System.out.println("result: " + isPrime(n) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        } else if (problem == 4) {
            int n = sc.nextInt();
            System.out.println(factorial(n));
            long startTime = System.nanoTime();
            System.out.println("result: " + factorial(n) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        } else if (problem == 5) {
            int n = sc.nextInt();
            System.out.println(fibonacci(n));
            long startTime = System.nanoTime();
            System.out.println("result: " + fibonacci(n) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        } else if (problem == 6) {
            System.out.println("enter number:");
            int a = sc.nextInt();
            System.out.println("enter the power of number:");
            int n = sc.nextInt();
            System.out.println(findthepowerofn(a, n));
            long startTime = System.nanoTime();
            System.out.println("result: " + findthepowerofn(a,n) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        } else if (problem == 7) {
            System.out.print("Enter length of an array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println("result");
            reversedArr(arr, 0,n-1);

            System.out.println("Reversed array:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            long startTime = System.nanoTime();
            System.out.println(
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");

        }
        else if (problem == 8){ // 8 problem

            System.out.print("Enter string to check for letters: ");

            sc.nextLine();

            String s = sc.nextLine();

            if(isAlpha(s))
                System.out.println("no");
            else
                System.out.println("yes");
            long startTime = System.nanoTime();
            System.out.println("result: " + isAlpha(s) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        }
        else if(problem==9){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long startTime = System.nanoTime();
            System.out.println("result: " + binomial(n,k) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        }
        else if(problem==10){
            int a=sc.nextInt();
            int b=sc.nextInt();
            long startTime = System.nanoTime();
            System.out.println("result: " + GCD(a,b) +
                    "\nruntime: "+(double)(System.nanoTime() - startTime)/1000000000+
                    "\ntime complexity: O(log n)");
        }
    }



    // Problem1
    public static int findmin(int[] arr) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
    //Problem2
    public static double findaverage(int[] arr){
        double sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    //Problem3
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //Problem4
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    //Problem5
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    //Problem6
    public static int findthepowerofn(int a,int n){
        if(n==0){
            return 1;
        }
        else{
            return a*findthepowerofn(a,n-1);
        }
    }
    //Problem7
    public static void reversedArr(int[] arr, int first, int last) {
        if (first >= last) {
            return;
        }

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

        reversedArr(arr, first + 1, last - 1);
    }
    //Problem8
    public static boolean isAlpha(String s) {

        if (s.isEmpty()) {
            return false;
        }


        char firstChar = s.charAt(0);
        if (Character.isLetter(firstChar)) {
            return true;
        }


        return isAlpha(s.substring(1));
    }
    //problem9
    public static int binomial(int n, int k){
        if(k == 0 || k==n){
            return 1;
        }
        else {
            return binomial(n-1,k-1) + binomial(n-1, k);
        }
    }
    //Probelm10
    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }
}
