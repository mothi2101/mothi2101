public class Reversestring
 {
    public static void main(String[] args) 
    {
        String input = "Mothilal";
        String reversed = reverseString (input);
        System.out.println("Reversed string:"+reversed);
    }
    public static String reverseString ( String str)
    {
        String reversed =" ";
        for (int i = str.length()-1; i>=0;i--)
        {
            reversed += str.charAt(i);
        } //Append each character from the end
        return reversed;
    }
}
