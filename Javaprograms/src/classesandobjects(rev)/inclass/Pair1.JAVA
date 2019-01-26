import java.util.*;
class Pair
{
int x,y,i,j;
Scanner S=new Scanner(System.in);
void set_element1()
{
	System.out.print("enter first element of pair");
	x=S.nextInt();
}	
void set_element2()
{
	System.out.print("enter second element of pair");
	y=S.nextInt();
}
int get_element1()
{
	return x;
}
int get_element2()
{
	return y;
}
void display(Pair[] P)
{
	Pair P1=new Pair();
	for(i=0;i<5;i++)
	{
	for(j=i+1;j<5;j++)
	{
	if(P[i].get_element2()>P[j].get_element2())
	{
                    P1.x = P[i].x;
                    P1.y = P[i].y;
                    P[i].x = P[j].x;
                    P[i].y = P[j].y;
                    P[j].x = P1.x;
                    P[j].y = P1.y;
	}
	}
	}
     System.out.print("[");
        for (i=0;i<5;i++)
        {
            System.out.print("("+P[i].get_element1()+", "+P[i].get_element2()+"),");
        }
        System.out.println("]");
} 
 public void Pair1()   
    { 
        this.x = 0; 
        this.y= 0; 
    } 
}
class Pair1
{ 
    public static void main(String[] args) 
    { 
        int i, x, y; 
        Pair[] pr= new Pair[5];
        Pair pr1= new Pair();
        for(i=0; i< 5; i++)
        {
            
                pr[i]= new Pair();
                pr[i].set_element1();
                pr[i].set_element2(); 
            
        }

        System.out.println("After sorting with respect to second element of the pair");
        pr1.display(pr);
    } 
} 