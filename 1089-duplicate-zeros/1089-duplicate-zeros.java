class Solution {
    public void duplicateZeros(int[] arr) {
        int a = 0;
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length && a < arr.length; i++) {
            if (arr[i] == 0) {
                newarr[a] = 0;
                if (a + 1 < arr.length) {
                    newarr[a + 1] = 0;
                }
                a += 2;
            } else
                newarr[a++] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newarr[i];
        }
    }
}