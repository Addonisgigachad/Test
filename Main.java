public class Main
{
    public static void main()
    {
        int summe=0;
        for(int i=1;i<=10;++i)
        {
            summe+=i;
        }
        
        int mult=1;
        for(int i=2;i<=10;++i)
        {
            mult*=i;
        }
        
        System.out.println("Summe: "+summe + "\n Multiplikation: "+mult);
    }
}
