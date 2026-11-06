public class project2 {
    public static void main(String[] args) {
        double[] bagrutScores = { 100, 85, 90, 54 };
        double[][] classBagrutScores = {
                { 100, 100, 100, 100 },
                { 80, 85, 87, 82 },
                { 80, 90, 52, 100 }
        };
        double circleRadius = 15;
        String textThatMayBeAPlaindrome = "racecar";
        int numberThatMayBePrime = 49;
        double[] location1 = { 0, 0 };
        double[] location2 = { 10, 10 };

        System.out.println(average(bagrutScores));
        System.out.println(average(classBagrutScores));
        System.out.println(getCircleArea(circleRadius));
        System.out.println(isPalindrome(textThatMayBeAPlaindrome));
        System.out.println(isPrime(numberThatMayBePrime));
        System.out.println(getDistance(location1[0], location1[1], location2[0], location2[1]));

    }

    public static double average(double[] theList) {
        double currentTotal = 0;
        for (double num : theList) {
            currentTotal += num; // add together all the scores
        }
        return currentTotal / theList.length; // divide by number of scores and return
    }

    public static double average(double[][] the2DList) {
        double result = 0;
        for (double[] row : the2DList) {
            result += average(row);
        }
        return result / the2DList.length;
    }

    public static double getCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2); // calculate area using the PI*R^2 formula
    }

    public static boolean isPalindrome(String text){
        String reversedText = "";
        for (int i = text.length()-1; i > -1; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText.equals(text);
    }

    public static boolean isPrime(int n) {
        if (n <= 1 || n == 2 || n % 2 == 0) { // is the number smaller then 1 OR is the number equal to 2 OR is the
                                              // number divisble by 2
            return false;
        }
        int root = (int) Math.sqrt(n); // get square root of the number
        for (int i = 3; i <= root; i += 2) { // check every divider up to the root
            if (n % i == 0) {
                return false; // if can be divided then its not a prime
            }
        }
        return true; // nothing worked must be a prime

    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        double xReaminder = x1 - x2;
        double yReaminder = y1 - y2;
        return Math.sqrt(Math.pow(xReaminder, 2) + Math.pow(yReaminder, 2));
    }

}
