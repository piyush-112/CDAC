//Want to print the subString from the given String

public class SubString {
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str="Im the king";
        System.out.println(substring(str, 7, 11));
    }
}
