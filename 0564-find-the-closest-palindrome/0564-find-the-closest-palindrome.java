class Solution {
    public String nearestPalindromic(String n) {
        String left = "", right = "", mid = "", temp1 = "", temp2 = "";
        String leftSuffix = "", rightSuffix = "", val0 = "", val1 = "", val2 = "", leftPrefix = "", rightPrefix = "";
        long leftNum, rightNum, original = Long.parseLong(n);
        int len = n.length();
        if (original <= 10)
            return Long.toString(original - 1);
        if(original==11)
            return "9";
        if (len % 2 == 0) {
            left = n.substring(0, len / 2);
            leftNum = Long.parseLong(left);
            right = rev(left);
            rightNum = Long.parseLong(right);
            // leftSuffix=
            temp2 = Long.toString(leftNum + 1);
            if (temp2.length() > left.length())
                val2 = "1" + "0".repeat(len - 1) + "1";
            else {
                leftSuffix = temp2;
                rightSuffix = rev(leftSuffix);
                val2 = leftSuffix + rightSuffix;
            }
            // 
            temp1 = Long.toString(leftNum - 1);
            if (temp1.length() < left.length())
                val0 = "9".repeat(len - 1);
            else {
                leftPrefix = temp1;
                rightPrefix = rev(leftPrefix);
                val0 = leftPrefix + rightPrefix;
            }
            val1 = left + right;

        } else {
            left = n.substring(0, len / 2 + 1);
            right = rev(left.substring(0, left.length() - 1));
            leftNum = Long.parseLong(left);
            rightNum = Long.parseLong(right);
            // leftPrefix=
            temp1 = Long.toString(leftNum - 1);
            if (temp1.length() < left.length())
                val0 = "9".repeat(len - 1);
            else {
                leftPrefix = temp1;
                rightPrefix = rev(temp1.substring(0, len / 2));
                val0 = leftPrefix + rightPrefix;
            }
            // rightPrefix = rev(Long.toString((leftNum - 1) / 10));

            // leftSuffix = Long.toString(leftNum + 1);
            temp2 = Long.toString(leftNum + 1);
            if (temp2.length() > left.length())
                val2 = "1" + "0".repeat(len - 1) + "1";
            else {
                leftSuffix = temp2;
                rightSuffix = rev(temp2.substring(0, len / 2));
                val2 = leftSuffix + rightSuffix;
            }
            // rightSuffix = rev(Long.toString((leftNum + 1) / 10));
            // val0 = leftPrefix + rightPrefix;
            val1 = left + right;
            // val2 = leftSuffix + rightSuffix;
        }
        long value0 = Long.parseLong(val0);
        long value1 = Long.parseLong(val1);
        long value2 = Long.parseLong(val2);
        long diff1, diff2, diff3;

        diff1 = Math.abs(original - value0);
        diff2 = Math.abs(original - value1);
        diff3 = Math.abs(original - value2);
        if (value1 == original) {
            diff2 = Long.MAX_VALUE;
            if (diff1 == diff3)
                return Long.toString(Math.min(value0, value2));
            else if (diff1 < diff3)
                return Long.toString(value0);
            else
                return Long.toString(value2);
        } else {
            if (diff1 < diff3 && diff2 < diff3) {
                if (diff1 == diff2)
                    return Long.toString(Math.min(value0, value1));
                else if (diff1 < diff2)
                    return Long.toString(value0);
                else
                    return Long.toString(value1);
            } else if (diff1 < diff2 && diff3 < diff2) {
                if (diff1 == diff3)
                    return Long.toString(Math.min(value0, value2));
                else if (diff1 < diff3)
                    return Long.toString(value0);
                else
                    return Long.toString(value2);
            } else {
                if (diff2 == diff3)
                    return Long.toString(Math.min(value1, value2));
                else if (diff2 < diff3)
                    return Long.toString(value1);
                else
                    return Long.toString(value2);
            }
        }

    }

    static String rev(String temp) {
        String reverse = "";
        for (int i = 0; i < temp.length(); i++) {
            reverse = temp.charAt(i) + reverse;
        }
        return reverse;
    }
}