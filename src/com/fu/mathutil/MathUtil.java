
package com.fu.mathutil;

public class MathUtil {
    //n! = 1.2.3.4.5.6....n
    //0! = 1! = 1
    //không tính giai thừa cho số âm
    //20! là vừa khớp cho kiểu long, 21! là lố kiểu long
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument");
        if(n == 0 || n == 1)
            return 1;
        long rs = 1;
        for (int i = 2; i <= n; i++) 
            rs *= i;
        return rs;
    }
}
