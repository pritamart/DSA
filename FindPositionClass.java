class FindPositionClass {
    static int findPosition(int n) {

        // Step 1: check valid single set bit
        if (n == 0 || (n & (n - 1)) != 0) {
            return -1;
        }

        // Step 2: find position
        int position = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                return position;
            }
            n = n >> 1;
            position++;
        }

        return -1;
    }
}
