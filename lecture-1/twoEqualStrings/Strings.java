package twoEqualStrings;

public class Strings {
    

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "hello";
        check(string1, string2);
        check(string1, string3);
    }

    public static void check(String string1 , String string2){
       System.out.println (string1 == string2); 
    }
}
