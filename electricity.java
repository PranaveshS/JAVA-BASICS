class electricity
{
    public static void main(String[] args)
    {
        int units=280;
        double ToPay=0;
        if(units<100)
        {
            ToPay = units*1.20;
        }
        else if(units<300)
        {
            ToPay = 100*1.20+(units-100)*2;
        }
        else if(units>300)
        {
            ToPay = 100 * 1.20 + 200 * 2 + (units-300)*3;
        }
        System.out.println("The electricity bill for " + units + " is:"+ToPay);
    }
}