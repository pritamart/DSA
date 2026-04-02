public class SecondHighest {
    public static void main(String[] args) {
        int[] numbers = {34, 35, 1, 10, 30, 1};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
            System.out.println("The second highest number is: " + secondHighest);
        
    }
}
