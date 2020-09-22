public class FizzBuzzTranslate {

    static public String readLessThan10(int number) {
        switch (number) {
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam";
            case 9:
                return "chin";
            case 10:
                return "muoi";
            case 0:
                return "khong";
            default:
                return null;
        }
    }


    public static String readMoreThan100(int number) {
        int du = number % 10;
//        String result = "";
        if (number>=100 || number <0)
            return "Ngoài giới hạn";
        if(number>0 && number<10)
            return readLessThan10(number);
        if (number > 10 && number < 20)
            return "muoi " + readLessThan10(du);
        if (number>=20) {
            if(number%10==0){
                int divi = number/10;
                return readLessThan10(divi) + " muoi";
            } else {
                int first = number/10;
                return readLessThan10(first) + " muoi " + readLessThan10(du);
            }
        }
        return null;
    }

}


