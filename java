***** string ****
 String first = "avipreet";
        String last = "singh";
        String fullname;
        fullname = first + " " + last;
        
        System.out.println("my full name is: " + fullname);
       
    }
    
}
*******************
 Scanner input = new Scanner(System.in);
        int a;
        int b;
        int sum;
        System.out.println("please enter first value");
        a = input.nextInt();
        System.out.println("please enter second value");
        b = input.nextInt();
        sum = a + b;
        
        sum = a + b;
        System.out.println("The sum of :" + a + "  and  " + b + "  is " + sum);
        
****string****8
Scanner input = new Scanner(System.in);
       System.out.println("Please enter your name");
       String name = input.next();
       String name1 = input.next();
       System.out.println("you entered: " + name + " " + name1);
       
       *****projectclass***
        Scanner input = new Scanner(System.in);
       
       int DiscountRate;
       
       int originalprice;
       
       int AmountSaved;
       
       int SalePrice;
       
       double Tax;
       
       double TotalPrice;
       
       double c;
       c = .065;
       
       System.out.println("please enter itemname:");
       
      String itemname = input.next();
      
       System.out.println("please enter discountRate:");
       
       DiscountRate = input.nextInt();
       
       System.out.println("please enter originalprice:");
       
       originalprice = input.nextInt();
       
       AmountSaved = originalprice * DiscountRate/100;
       
       SalePrice = originalprice - AmountSaved;
       
       Tax =  SalePrice * c ;
       
       TotalPrice = SalePrice + Tax;
       
       System.out.println("TotalPrice :" + TotalPrice);
       
       
       *****function***********
       
       
       import java.util.Scanner;

/**
 *
 * @author 758401
 */
public class Hello {
    public static double average(int x, int y){
        double avg = (x+y/2.0);
        return avg;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two value");
        int x = input.nextInt();
        int y = input.nextInt();
        double avg = average(x,y);
        System.out.println("the average is " + avg);
        
         System.out.println("please enter two value");
        int a = input.nextInt();
        int b = input.nextInt();
        double avg2 = average(a,b);
        System.out.println("the average is " + avg2);
        
        
        
        // TODO code application logic here
    }
    
}

***********larger value*********
 Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Please enter first value");
        int value1;
        value1 = input.nextInt();
        System.out.println("Please enter the second value");
        int value2;
        value2 = input.nextInt();
        if(value1>value2)
            System.out.println(value1 + "is greater than" + value2);
        else
            System.out.println(value2 + "is greater than" + value1);
            
            ***second part****
             if(value1>value2){
           // System.out.println(value1 + "is greater than" + value2);
            if(value1>0)
                System.out.println(value1 + "is greater than" + value2 + " and positive");
            else
                System.out.println(value1 + "is greater than" + value2 + " and negative");
        }       
        else
            System.out.println(value2 + "is greater than" + value1);
 
 
 ***********if else if statment*******
 Scanner input = new Scanner(System.in);
        System.out.println("enter the score");
        double score = input.nextDouble();
        
        if(score<=60)
            System.out.println("grade F");
        else if(score<=70)
            System.out.println("grade D");
        else if(score<=80)
            System.out.println("grade B");
        else if(score<=90)
            System.out.println("grade A");
        else
            System.out.println("grade A");
       
