package method_overriding;



public class Driver {
	
	public static void main(String[] args)
    {
        
        Parent b=new Parent();
        Parent c=new Child1();
        Parent d=new Child2();
        
        b.Print();
        c.Print();
        d.Print();
       
           
         
         
    }

}
