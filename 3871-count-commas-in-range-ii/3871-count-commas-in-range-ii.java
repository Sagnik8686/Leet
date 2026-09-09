class Solution {
    public long countCommas(long n) {
        long copy = n;
        int count = 0, comma = 0;
        while (copy != 0) {
            count++;
            copy /= 10;
        }
        if (count <= 3)
            return 0;
        else if (count <= 6) {
            return (n - 999);
        } else if (count <= 9)
            return 999999 - 999 + 2 * (n - 999999);
        else if (count <= 12)
            return 999999 - 999 + 2 * (999999999 - 999999) + 3 * (n - 999999999);
        else if (count <= 15)
            return 999999 - 999 + 2 * (999999999 - 999999) + 3 * (999999999999L - 999999999) + 4 * (n - 999999999999L);
        else
            return (999999L - 999)
                    + 2 * (999999999L - 999999)
                    + 3 * (999999999999L - 999999999)
                    + 4 * (999999999999999L - 999999999999L)
                    + 5 * (n - 999999999999999L);

    }
}