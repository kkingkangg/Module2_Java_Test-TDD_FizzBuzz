public class FizzBuzz {
    public static String isFizzBuzz(int number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        if (number < 0)
            throw new RuntimeException("out of range exception");
        else {
            if(fizz && buzz)
                return "FizzBuzz";
            if(fizz)
                return "Fizz";
            if(buzz)
                return "Buzz";
//            return Integer.toString(number);
            return String.valueOf(number);
        }
    }
}
