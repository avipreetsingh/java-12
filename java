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
            
            
            ***************loops*********
            Scanner input = new Scanner(System.in);
        System.out.println("The profgram calculate the total of five numbers");
        int total =0;
        for(int count =1;count<=5; count++){ 
            System.out.println("please enter a number");
            int number = input.nextInt();                    
            total = total + number;        
        }
        System.out.println("the total is"+total);
        System.out.println("------------------------------------");
        total =0;
        int count =0;
        while(count<5){            
            System.out.println("please enter a number");
            int number = input.nextInt();                    
            total = total + number;
            ++count;
        }
        System.out.println("the total is"+total);
        System.out.println("------------------------------------");
        count =1;
        total =0;
        do{
            System.out.println("please enter a number");
            int number = input.nextInt();                    
            total = total + number;  
            ++count;
        }while(count<=5);
        
        
    }
    *********************************************
     /* Scanner input = new Scanner(System.in);
        int count = 0;
        while(count<10){
            System.out.println(count + "welcome");
            ++count;
        }
        String s="yes";
        System.out.println("do you want to add number ");
        s =input.next();
        int sum =0;
        while (s=="yes"){
            System.out.println("please enter the number");
            int nbr = input.nextInt();
            sum = sum +nbr;
            System.out.println("do you want to add number");*/
       /*int count =1;
       int sum =0;
       while (count<=10){
           sum = sum +count;
           ++count;
        }
       System.out.println(sum);
       
        count =1;
        sum=0;
       do{
           sum = sum +count;
           ++count;
       }
       while(count<=10);*/
      /* int sum =0;
       for(int i=0;i<=10;++i){
           sum = sum +i;
       }*/
      /* int sum = 0;
        System.out.println(sum);
       for(int i=10 ; i>0;--i){
           sum = sum +i;
       }
        System.out.println(sum);*/
    ********************************************
    
    ***********Arrays***********
     {
       int [] A = {45,52,63,41,87};
       int [] B = new int[4];
       B[0]=45;
       B[1]=32;
       B[2]=32;
       B[3]=96;
       
        
               
       
       for(int i=0; i<A.length;i++)
           System.out.println(A[i]);
       
       
       for(int i=0; i<B.length;i++)
       System.out.println(B[i]);
       
       int sum =0;{
         for(int i=0; i<A.length;i++)
           sum= sum+A[i];
           System.out.println(sum);
         
              
               
       }
       double avg = sum/A.length;
       System.out.println(avg);
      
       int [] C= {12,56,78,65,52};
       int search = 12;
       for(int i=0; i<C.length; i++)
           if (C[i]==search){
               System.out.printf("the element with index %d is equal to searched value \n",i);
              break;
           }
           String [] FN = new String[2];
       String [] LN = new String[2];
       String [] CD = new String[2];
       
       for(int i=0; i<FN.length; i++){
           
       
       System.out.println("enter the first name: ");
       FN[i] = input.nextLine();
       
       System.out.println("enter the last name: ");
       LN[i] = input.nextLine();
       
       System.out.println("enter the course code name: ");
       CD[i] = input.nextLine();
       System.out.println("The Firstname is  "  + FN[i] + "\n The Lastname is  "  + LN[i] + "\n The Course Code is  " + CD[i] + ". ");
    
    }  
    
    
}

 int [] a = new int[100];
    int count=0;
    a[0] = 1;
    ++count;
    
    a[2] = 6;
    ++count;
    
    a[3] = 9;
    ++count;
    for(int i=0; i<count; i++)
        System.out.println(a[i]);
        
        
 **********       
        
  Scanner input = new Scanner(System.in);
    final int SIZE = 100;
    int [] a = new int[100];
    int count=0;
    System.out.println("please enter a  number -1 is quit");
    int number = input.nextInt();
    
    while ((number!=0) && (count<SIZE)) {
        a[count]=number;
        ++count;
    System.out.println("please enter a  number -1 is quit");
     number = input.nextInt();
            
        

       
