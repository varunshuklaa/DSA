 class first
{
    public static void printnum(int n, int fact)
    {
        if(n==1) {
            fact *= n;
            System.out.println(fact);
            return;
        }
        fact*=n;
        printnum(n-1, fact);
    }

    public static void main(String args[])
    {
        int n=3;
        printnum(n,1);
    }
}