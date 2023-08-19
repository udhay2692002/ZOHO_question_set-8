public class permutationstring {

    public static void main(String[] args)
    {
        stringpermutation("ABC");
    }

    private static void stringpermutation(String input)
    {
        System.out.println("PERMUTATION OF STRING IS:"+input);
        swap("",input);

    }
    private static void swap(String permutation,String input)
    {
        if (input.length()==0)
        {
            System.out.println(permutation);
        }
        else
        {
            for(int i=0;i<input.length();i++)
            {
                swap(permutation+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
            }
        }

    }
}
