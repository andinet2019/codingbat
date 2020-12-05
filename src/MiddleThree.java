public class MiddleThree {

    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
    }

    public  static String middleThree(String str) {
        int middle=(str.length()-1)/2;

        if(str.length()>=3  && str.length() % 2!=0){

            return str.substring(middle-1,middle+2);}
        return  str;
}


}

