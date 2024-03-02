//   creation of object
 class fruit
   { 
   int x;
   int y;
   
     static void fun()
        {
            System.out.println("apple");
        }
     static void fun2()
        {
            System.out.println("grapes");
        }
    }
    public class object
    {
       
     public static void main(String[] args) 
  
    {   int z=5;
        float u=1265498;
    
        {
            System.out.println("fruit");
           fruit f1=new fruit();

           fruit.fun();
           fruit.fun2();
           f1.x=3;
           f1.y=4;
          
        
           {
            System.out.println(f1.x);
            System.out.println(f1.x);
            System.out.println(f1.y);
            System.out.println(z);
            System.out.println(u);
            
           }
        }
    
   }
}

