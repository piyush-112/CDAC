
//I/p=hi,myname is aniket g khatal patil
//o/p=Hi,My Name Is Aniket G khatal Patil
public class FirstLetterUpper {
    public static String isUppercase(String str){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        String str="hi, myname is aniket g khatal patil";
        System.out.println(isUppercase(str));
    }
}
