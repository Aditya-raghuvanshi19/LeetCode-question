import java.math.BigInteger;

class Solution {
    public int[] findnse(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    public int[] findpsee(int[] arr) {
        int n = arr.length;
        int[] psee = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }

    public BigInteger sumSubarrayMins(int[] arr) {
        int[] nse = findnse(arr);
        int[] psee = findpsee(arr);
        BigInteger total = BigInteger.ZERO;

        for (int i = 0; i < arr.length; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            BigInteger contrib = BigInteger.valueOf(arr[i])
                .multiply(BigInteger.valueOf(left))
                .multiply(BigInteger.valueOf(right));
            total = total.add(contrib);
        }
        return total;
    }

    public int[] findnge(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i])
                st.pop();
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nge;
    }

    public int[] findpgee(int[] arr) {
        int n = arr.length;
        int[] pgee = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();
            pgee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pgee;
    }

    public BigInteger sumSubarrayMax(int[] arr) {
        int[] nge = findnge(arr);
        int[] pgee = findpgee(arr);
        BigInteger total = BigInteger.ZERO;

        for (int i = 0; i < arr.length; i++) {
            int left = i - pgee[i];
            int right = nge[i] - i;
            BigInteger contrib = BigInteger.valueOf(arr[i])
                .multiply(BigInteger.valueOf(left))
                .multiply(BigInteger.valueOf(right));
            total = total.add(contrib);
        }
        return total;
    }

    public long subArrayRanges(int[] nums) {
        BigInteger maxSum = sumSubarrayMax(nums);
        BigInteger minSum = sumSubarrayMins(nums);
        return maxSum.subtract(minSum).longValue();
    }
}
