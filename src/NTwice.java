public class NTwice {
    public static void main(String[] args) {
        System.out.println(nTwice("Chocolate",1));
    }

    public static String nTwice(String str, int n) {

        return str.substring(0,n).concat(str.substring(str.length()-n,str.length()));


    }}




