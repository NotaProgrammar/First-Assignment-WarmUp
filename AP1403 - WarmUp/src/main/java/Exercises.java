public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        boolean flag = true;
        if(n==1)
            return false;
        for (long i=2; i*i<=n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag == true)
            return true;
        else
            return false;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        long x=0 , y=1 , i=0, temp=0;
        while(x<=n)
        {
            if(x==n)
            {
                return i;
            }
            temp=y;
            y+=x;
            x=temp;
            i++;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        // todo
        return null;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
