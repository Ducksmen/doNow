package donow;

public class donow {

    public static String doNow(String str1)
    {
        while (str1.length() > 0)
        {
            System.out.println(str1);
            str1 = str1.substring(1, str1.length()-1);
        }
        return str1;
    }

    public static void doNow2(String str2)
    {
        for (int i = 0;i < str2.length(); i++)
        {
            System.out.println(str2);
            str2 = str2.substring(str2.length() - 1) + str2.substring(0, str2.length() - 1);
        }
    }
}
