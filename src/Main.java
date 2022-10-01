public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static Boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        String newStr = "";
        char ch = ' ';
        for (int i=0; i<s.length(); i++) {
            ch= s.charAt(i); //extracts each character
            newStr= ch+newStr; //adds each character in front of the existing string
        }
        System.out.println(s);
        System.out.println(newStr);
        return newStr.equals(s);
    }
}