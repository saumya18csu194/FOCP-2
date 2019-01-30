class Tt  
{ 
    public static void main(String[] args) 
    { try
        { 
        	        System.out.println(1/0); 

            throw new ArithmeticException("demo"); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.println("Caught inside fun().");    } 
}
} 