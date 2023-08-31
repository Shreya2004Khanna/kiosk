import java.util.*;
class macD
{
    public static void main()
    {
        String[] a={"Burger","Colddrink","macpuff","icecream","fries"};
        System .out.println("MENU== BURGER COLDDRINK  MACPUFF  ICECREAM  FRIES " );
        System.out.println("enter the number of items you want");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int B=0,C=0,M=0,I=0,F=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter the "+i+"thing you want");
            String str= sc.next();    
            if(str.equalsIgnoreCase("Burger"))
            {
                System.out.println("enter  \n 1 for aloo tikki burger (40rs)   \n  2 for paneer burger(60rs)  \n  3 for non-veg burger(80rs)");
                int ch=sc.nextInt();
                 int s=0;
                switch(ch)
                {
                    case 1:
                        {
                          System.out.println("enter the quantity of aloo tikki burger");
                          int q1=sc.nextInt();
                          s=q1*40;
                          break;
                        }
                    case 2:
                        {
                          System.out.println("enter the quantity of paneer burger");
                          int q2=sc.nextInt();  
                          s=q2*60;
                          break;
                        }
                    case 3:
                        {
                          System.out.println("enter the quantity of non_veg burger");
                          int q3=sc.nextInt(); 
                          s=q3*80;
                          break;
                        }
                }
                B=s;
            }
            else if(str.equalsIgnoreCase("colddrink"))
            {
                System.out.println("enter  \n 1 for cocacola(50rs)   \n  2 for coffee(60rs)  \n  3 for icedtea(60rs)");
                int ch1=sc.nextInt();
                int b=0;
                switch(ch1)
                {
                    case 1:
                        {
                          System.out.println("enter the quantity of cocacola");
                          int f1=sc.nextInt();
                           b=f1*50;
                          break;
                        }
                    case 2:
                        {
                          System.out.println("enter the quantity of coffee");
                          int f2=sc.nextInt(); 
                           b=f2*60;
                          break;
                        }
                    case 3:
                        {
                          System.out.println("enter the quantity of icedtea");
                          int f3=sc.nextInt(); 
                           b=f3*60;
                          break;
                        }
                    }
                    C=b;
            }
            else if(str.equalsIgnoreCase("fries"))
            {
                System.out.println("enter  \n 1 for small fries(40rs)   \n  2 for medium fries(80rs)   \n  3 for large fries(120rs)");
                int ch2=sc.nextInt();
                int c=0;
                switch(ch2)
                {
                    case 1:
                        {
                          System.out.println("enter the quantity of small fries");
                          int a1=sc.nextInt();
                           c=a1*40;
                          break;
                        }
                    case 2:
                        {
                          System.out.println("enter the quantity of medium fries");
                          int a2=sc.nextInt();  
                           c=a2*80;
                          break;
                        }
                    case 3:
                        {
                          System.out.println("enter the quantity of large fries");
                          int a3=sc.nextInt(); 
                           c=a3*120;
                          break;
                        }
                }
                 F=c;
            }
             else if(str.equalsIgnoreCase("icecream"))
            {
                System.out.println("enter  \n 1 for venilla(40rs)   \n  2 for oreo icecream(70rs)   \n  3 for mcflurry(100rs)");
                int ch3=sc.nextInt();
                int d=0;
                switch(ch3)
                {
                    case 1:
                        {
                          System.out.println("enter the quantity of venilla");
                          int b1=sc.nextInt();
                           d=b1*40;
                          break;
                        }
                    case 2:
                        {
                          System.out.println("enter the quantity of oreo");
                          int b2=sc.nextInt();  
                           d=b2*70;
                          break;
                        }
                    case 3:
                        {
                          System.out.println("enter the quantity of mecflurry");
                          int b3=sc.nextInt(); 
                           d=b3*120;
                          break;
                        }
                }
                I=d;
            }
             else if(str.equalsIgnoreCase("macpuff"))
            {
                System.out.println("enter  \n 1 for veg macpuff(30rs)   \n  2 for paneer macpuff(50rs)   ");
                int ch2=sc.nextInt();
                int e=0;
                switch(ch2)
                {
                    case 1:
                        {
                          System.out.println("enter the quantity of veg macpuff");
                          int c1=sc.nextInt();
                           e=c1*30;
                          break;
                        }
                    case 2:
                        {
                          System.out.println("enter the quantity of paneer macpuff");
                          int c2=sc.nextInt();  
                           e=c2*50;
                          break;
                        }
                }
                M=e;
            }
        }
        int sum = B+M+C+I+F;
        System.out.println("your total == "+sum+"Rs");
    }
}