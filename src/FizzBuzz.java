public class FizzBuzz {
    public static String isFizzBuzz(int number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        String string = String.valueOf(number);
        if (number < 0)
            throw new RuntimeException("out of range exception");
        else {
            if(fizz && buzz)
                return "FizzBuzz";
            if(fizz || string.contains("3"))
                return "Fizz";
            if(buzz || string.contains("5"))
                return "Buzz";
//            return Integer.toString(number);
            return String.valueOf(number);
        }
    }




    public static void main(String[] args) {
        int num = 132;
        String str = String.valueOf(num);
        boolean s = str.contains("5") == true;
        if(s)
            System.out.println("có 3");
        else
            System.out.println("chịu");
    }

}
