public class Main
{
    public static void main()
    {

        int obereGrenze=15;
        int summe=0;
        for(int i=1;i<=obereGrenze;++i)

        {
            summe+=i;
        }
        
        int mult=1;

        for(int i=2;i<=obereGrenze;++i)

        {
            mult*=i;
        }
        
        System.out.println("Summe: "+summe + "\n Multiplikation: "+mult);
    }
}
