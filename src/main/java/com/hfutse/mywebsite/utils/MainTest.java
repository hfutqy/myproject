package com.hfutse.mywebsite.utils;

import java.util.HashMap;

/**
 * 测试类
 */
//public class MainTest {
//    public static void main(String[] agrs) throws Exception {
//        String url = "data=xxx%3dd";
//        if (url.length() > 10) {
//            url = url.substring(0, 10);
//        }
//        System.out.print(url);
//    }
//
//    public int query(int a) {
//        return a;
//    }
//
//    public String query(int b,int c) {
//        return b+"";
//    }
//
//    /**
//     * 加密结果
//     */
//    public static void main(String[] agrs) {
//        String str = "{sfadf{{afad{}";
//        char[] strC = str.toCharArray();
//        String endS = "";
//        if(strC.length > 1){
//            //头
//            if(strC[0] == '{' && strC[1] != '{'){
//                endS+='{';
//            }
//            //尾
//            if(strC[strC.length-1] == '{' && strC[strC.length-2] != '{'){
//                endS+='{';
//            }
//        }else if(strC.length==1 && strC[0]=='{'){
//            endS+='{';
//        }
//        //中间
//        for(int i=1; i<strC.length-1; i++){
//            if(strC[i] == '{' && strC[i+1] == '{'){
//                continue;
//            }else if(strC[i] == '{' && strC[i-1] == '{'){
//                continue;
//            }else if(strC[i] == '{'){
//                endS+='{';
//            }
//        }
//        System.out.print(endS);
//    }
//
public class MainTest {
    public static void main(String[] args) {
        int n=10;
        System.out.println(getWays(n));
    }

    static int getWays(int n) {
        int f1 = 1;
        int f2 = 2;
        int count = 0;
        for(int i = 3; i<=n; i++){
            count = f1+f2;
            f1 = f2;
            f2 = count;
        }
        return count;
    }
}
//    public static void main(String[] args) {
//        int[] a = {2, 3, 5, 6, 9, 10, 13};
//        int[] b = {7, 8, 9, 10, 11, 12};
//        System.out.println(findMedianSortedArrays(a,b));
//    }
//    public static double findMedianSortedArrays(int[] A, int[] B) {
//        int m = A.length;
//        int n = B.length;
//        if (m > n) { // to ensure m<=n
//            int[] temp = A; A = B; B = temp;
//            int tmp = m; m = n; n = tmp;
//        }
//        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
//        int count=0;
//        while (iMin <= iMax) {
//            count++;
//            int i = (iMin + iMax) / 2;
//            int j = halfLen - i;
//            if (i < iMax && B[j-1] > A[i]){
//                iMin = i + 1; // i is too small
//            }
//            else if (i > iMin && A[i-1] > B[j]) {
//                iMax = i - 1; // i is too big
//            }
//            else { // i is perfect
//                int maxLeft = 0;
//                if (i == 0) { maxLeft = B[j-1]; }
//                else if (j == 0) { maxLeft = A[i-1]; }
//                else { maxLeft = Math.max(A[i-1], B[j-1]); }
//                if ( (m + n) % 2 == 1 ) {
//                    System.out.println(count+"is count");
//                    return maxLeft;
//                }
//
//                int minRight = 0;
//                if (i == m) { minRight = B[j]; }
//                else if (j == n) { minRight = A[i]; }
//                else { minRight = Math.min(B[j], A[i]); }
//
//                System.out.println(count+"is count");
//                return (maxLeft + minRight) / 2.0;
//            }
//        }
//        System.out.println(count+"is count");
//        return 0.0;
//    }
//}
