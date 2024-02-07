import java.util.Scanner;
class curr_converter
{
    public static void main(String args[])
    {
        System.out.println("1 Rupees");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");

        Scanner s= new Scanner(System.in);
        System.out.println("ENTER THE CURRENCY");
        int choice= s.nextInt();
        System.out.println("ENTER THE AMOUNT YOU WANT TO CONVERT");
        double amt= s.nextDouble();

        switch(choice)
        {
            case 1:
                rupee_convert(amt);
                break;
            case 2:
                dollar_convert(amt);
                break;
            case 3:
                euro_convert(amt);
                break;
            case 4:
                System.out.println("Invalid choice");
        }
    }

        public static void rupee_convert(double amount)
        {
            System.out.println("1 Rupee=" +0.013 + " Dollar");
            System.out.println();

            System.out.println(amount+" Rupee= "+ (amount*0.013)+ " Dollar ");
            System.out.println();

            System.out.println("1 Rupee=" +0.012+ " Euro");
            System.out.println();

            System.out.println(amount + " Rupee= "+ (amount*0.012) + " Euro ");
            System.out.println();
        }
        
        public static void dollar_convert(double amount)
        {
            System.out.println("1 Dollar= "+79.37+" Rupee");
            System.out.println();

            System.out.println(amount+"Dollar="+(amount*79.37)+ " Rupee");
            System.out.println();

            System.out.println("1 Dollar=" +0.98+ " Euro ");
            System.out.println();

            System.out.println(amount+ "Dollar="+(amount*0.98)+ " Euro");
            System.out.println();
        }

        public static void euro_convert(double amount)
        {
            System.out.println("1 Euro= "+ 80.85 + "Rupee");
            System.out.println();
            
            System.out.println(amount+ "Euro=" +(amount*80.85)+ "Rupee");
            System.out.println();

            System.out.println("1 Euro= "+ 1.02 + " Dollar");
            System.out.println();

            System.out.println(amount+"Euro="+(amount*1.02)+ " Euro");
            System.out.println();
        }

}

        



    
