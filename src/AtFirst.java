public class AtFirst {

//    Given a string, return a string length 2 made of its first 2 chars.
//    If the string length is less than 2, use '@' for the missing chars.
    public static void main(String[] args) {
        System.out.println(atFirst(""));
    }
    //if str.length<2
    public static  String atFirst(String str) {
if(str.length()>=2){
    return str.substring(0,2);
}

else if (str.equals("")) {return "@@";
    }

else {return str.substring(0)  + "@";

}



}}
