package construtor;

public class Person 
{
    public int x;
    public int y;
    
    public Person(int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
    }
    
    public Person(Person p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    
    public static void main(String[] args)
    {
        Person p1 = new Person(1,2);
        Person p2 =  new Person(p1);
        
        System.out.println(p1.x + " " + p1.y); 
        System.out.println(p2.x + " " + p2.y); 
        
        p2.x = 3;
        p2.y = 4;

        System.out.println(p1.x + " " + p1.y); 
        System.out.println(p2.x + " " + p2.y); 
    }
}


