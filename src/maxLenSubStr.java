import java.util.Scanner;
class maxLenSubStr{
    static int maxLenSubStr(String s)
    {
        if (s.length() < 3)
            return s.length();

        int temp = 2;
        int ans = 2;

        for (int i = 2; i < s.length(); i++)
        {

            // If no three consecutive characters
            // are same then increment temporary count
            if (s.charAt(i) != s.charAt(i - 1) ||
                    s.charAt(i) != s.charAt(i - 2))
                temp++;

                // Else update the final ans and
                // reset the temporary count
            else
            {
                ans = Math.max(temp, ans);
                temp = 2;
            }
        }
        ans = Math.max(temp, ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Type a string:");
        String s=c.nextLine();
        System.out.println(maxLenSubStr(s));
    }
}