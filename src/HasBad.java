public class HasBad {

    public static void main(String[] args) {
        System.out.println(hasBad("xxbadxx"));
    }

    public static boolean hasBad(String str) {

        String temp="bad";
if(temp.equals(str.substring(0,3))){

        return true;}

        if (temp.equals(str.substring(1,4))){
            return  true;
        }
        else{ return   false;}
    }

}
