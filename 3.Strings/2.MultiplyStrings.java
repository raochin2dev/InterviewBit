
import java.util.*;

public class MultiplyStrings {

    public static void main(String[] args) {

        String ans = multiplyCustom("5131848155574784703269632922904933776792735241197982102373370", "56675688419586288442134264892419611145485574406534291250836");
        System.out.println(ans);
        String ans1 = multiply("5131848155574784703269632922904933776792735241197982102373370", "56675688419586288442134264892419611145485574406534291250836");
        System.out.println(ans1);
        String ans2 = multiplyCustom("123456789", "987654321");
        System.out.println(ans2);
//        String ans3 = multiply("0000123", "0000456");
//        System.out.println(ans3);

    }

    public static String multiply(String A, String B) {
        ArrayList<Character> res = new ArrayList<>();
        int i;
        int n, m;

        n = A.length();
        for (i = 0; i < n && A.charAt(i) == '0'; i++);
        if (i == n) {
            return "0";
        }

        A = A.substring(i, n);

        n = B.length();
        for (i = 0; i < n && B.charAt(i) == '0'; i++);
        if (i == n) {
            return "0";
        }

        B = B.substring(i, n);

        int carry = 0;
        char cA, cB;
        char c;

        m = A.length();
        n = B.length();
        int index = 0;

        for (i = m - 1; i >= 0; i--) {

            cA = A.charAt(i);
            int a = cA - '0';
            int b;
            int num;
            int curIndex = index;

            for (int j = n - 1; j >= 0; j--) {
                cB = B.charAt(j);
                b = cB - '0';
                num = a * b + carry;
                carry = num / 10;
                num %= 10;
                c = (char) (num + '0');

                if (curIndex >= res.size()) {
                    res.add(c);
                } else {
                    num += res.get(curIndex) - '0';
                    carry += (num / 10);
                    num %= 10;
                    c = (char) (num + '0');
                    res.set(curIndex, c);
                }

                curIndex++;
            }

            c = (char) (carry + '0');
            carry = 0;
            res.add(c);

            index++;
        }

        Collections.reverse(res);

        StringBuilder str = new StringBuilder();

        i = 0;
        n = res.size();

        while (i < n && res.get(i) == '0') {
            i++;
        }

        for (; i < n; i++) {
            str.append(res.get(i));
        }

        return str.toString();

    }

    public static String multiplyCustom(String A, String B) {

        int lenA = A.length();
        int lenB = B.length();
        int carry = 0;
        double sum = 0;
        for (int i = lenA - 1; i >= 0; i--) {
            double intSum = 0;
            carry = 0;
            for (int j = lenB - 1; j >= 0; j--) {

                double product = ((A.charAt(i) - '0') * (B.charAt(j) - '0')) + carry;
                intSum += product * Math.pow(10, (lenB - 1 - j));

            }
            sum += intSum * Math.pow(10, (lenA - 1 - i));

        }

        StringBuilder str = new StringBuilder();
        double temp = sum;
        while((int)temp > 0) {
            String s = (int)(temp%10) + "";
            str.append(s);
            temp = (temp/10);
            String[] tempArr = String.format("%f",temp).split("\\.");
            temp = new Double(tempArr[0]);
        }

        return str.reverse().toString();
    }

}
