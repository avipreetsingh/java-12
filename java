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
       
