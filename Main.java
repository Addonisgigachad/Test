public class Main
{
    public static void main()
    {
        int og=10;
        int summe=0;
        for(int i=1;i<=og;++i)
        {
            summe+=i;
        }
        
        int mult=1;
        for(int i=2;i<=og;++i)
        {
            mult*=i;
        }
        
        System.out.println("Summe: "+summe + "\n Multiplikation: "+mult);
    }
}
