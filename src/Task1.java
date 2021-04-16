import java.util.*;  


//you need two arrays one for products and one for selected items
//create a product objects 
//use cart list array to manage selected products
//product array can be broken down to 4 arrays for simplication and to be  more specific to instructions

public class Task1 {
    public static void main(String[] args) throws Exception {
        
        Product[] phones = new Product[10];
        Product[] sims = new Product[2];
        Product[] cases = new Product[2];
        Product[] chargers = new Product[2]; 
        Cart cartlist = new Cart();//to manage selected products
        Scanner sc= new Scanner(System.in);

        phones[0] = new Product("Phone", "BPCM", "Compact", 29.99);
        phones[1] = new Product("Phone", "BPSH", "Clam Shell", 49.99);
        phones[2] = new Product("Phone", "RPSS", "RoboPhone – 5-inch screen and 64GB memory", 199.99);
        phones[3] = new Product("Phone", "RPLL", "RoboPhone – 6-inch screen and 256GB memory", 499.99);
        phones[4] = new Product("Phone", "YPLS", "Y-Phone Standard – 6-inch screen and 64GB memory", 549.99);
        phones[5] = new Product("Phone", "YPLL", "Y-Phone Deluxe – 6-inch screen and 256GB memory", 649.99);
        phones[6] = new Product("Tablet", "RTMS", "RoboTab – 8-inch screen and 64GB memory", 149.99);
        phones[7] = new Product("Tablet", "RTLM", "RoboTab – 10-inch screen and 128GB memory", 299.99);
        phones[8] = new Product("Tablet", "YTLM", "Y-Tab Standard – 10-inch screen and 128GB memory", 499.99);
        phones[9] = new Product("Tablet", "YTLL", "Y-Tab Deluxe – 10-inch screen and 256GB memory", 599.99);
        sims[0] = new Product("SIM card", "SMNO", "SIM Free (no SIM card purchased) ", 0.00);
        sims[1] = new Product("SIM card", "SMPG", "Pay As You Go (SIM card purchased)", 9.99);
        cases[0] = new Product("Case", "CSST", "Standard", 0.00);
        cases[1] = new Product("Case", "CSLX", "Luxury", 50.00);
        chargers[0] = new Product("Charger", "CGCR", "Car", 19.99);
        chargers[1] = new Product("Charger", "CGHM", "Home", 15.99);

        System.out.println("SELECT PRODUCTS");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("  Category ,Item code ,Description ,Price ($)");
        System.out.println("------------------------------------------------------------------------------");
      
        for (int i = 0; i < phones.length; i++) {
        
            System.out.println(i+1+". "+phones[i].getCategory()+" ,  "+phones[i].getItemcode()+" ,  "+phones[i].getDescription()+" ,  "+phones[i].getPrice());
        }
        System.out.println("\nWhich mobile device would you like to purchase?");
        int selectedphone= sc.nextInt(); 


        
        cartlist.add(phones[selectedphone-1]); // add item to cart

        for (int i = 0; i < sims.length; i++) {
        
            System.out.println(i+1+". "+sims[i].getCategory()+" ,  "+sims[i].getItemcode()+" ,  "+sims[i].getDescription()+" ,  "+sims[i].getPrice());
        }
         System.out.println("\nWhich sim model would you like?");
         int selectedsim= sc.nextInt(); 


         
         cartlist.add(sims[selectedsim-1]); // add item to cart

         for (int i = 0; i < cases.length; i++) {
        
            System.out.println(i+1+". "+cases[i].getCategory()+" ,  "+cases[i].getItemcode()+" ,  "+cases[i].getDescription()+" ,  "+cases[i].getPrice());
        }
         System.out.println("\nWhich case would you like?");
         int selectedcase= sc.nextInt(); 

         
         cartlist.add(cases[selectedcase-1]); // add item to cart

         for (int i = 0; i < chargers.length; i++) {
        
            System.out.println(i+1+". "+chargers[i].getCategory()+" ,  "+chargers[i].getItemcode()+" ,  "+chargers[i].getDescription()+" ,  "+chargers[i].getPrice());
        }
         System.out.println("3.both\n4.none\nWhich charger would you like?");
         int selectedcharger= sc.nextInt(); 
         sc.close();
         if (selectedcharger==1) {
            cartlist.add(chargers[selectedcharger-1]); 
         } else if(selectedcharger==2) {
            cartlist.add(chargers[selectedcharger-1]);  
         }else if(selectedcharger==3){
            cartlist.add(chargers[0]);
            cartlist.add(chargers[1]);  
         }else{
            System.out.println("You do not require a charger."); 
         }


        Product[] list = cartlist.getProducts(); // get products from the cart
        double totalprice = 0.00;

        for (int i = 0; i < list.length; i++) {
            if(list[i]!=null){
            totalprice=totalprice+list[i].getPrice();
            System.out.println(i+1+". "+list[i].getCategory()+" ,  "+list[i].getItemcode()+" ,  "+list[i].getDescription()+" ,  "+list[i].getPrice());
            }
        }
        System.out.println("Total price:"+totalprice); 
       
    }

   
}
