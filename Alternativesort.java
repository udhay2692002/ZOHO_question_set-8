public class AlternateSort
{
    public static void main(String[] args)
    {
        int[] arr=new int[]{1,2,3,4,5,6,7};
        altersort(arr);

        for (int num:arr)
        {
            System.out.print("\t"+num);
        }

    }

    public static  void  altersort(int[] arr)
    {
      int n=arr.length;
      int maxelement=arr[n-1]+1;
      int maxindex=n-1;
      int minindex=0;

      for(int i=0;i<n;i++)
      {
          if(i%2==0)
          {
              arr[i]+=(arr[maxindex]%maxelement)*maxelement;
              maxindex--;
          }
          else {
              arr[i]+=(arr[minindex]%maxelement)*maxelement;
              minindex++;
          }
      }
      for (int j=0;j<n;j++)
      {
          arr[j]=arr[j]/maxelement;
      }

    }
}
