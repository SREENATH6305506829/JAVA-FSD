package Phase1;

public class Sum {
	public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(10, 90)); 
        System.out.println(s.sum(10, 20, 70)); 
        System.out.println(s.sum(10.5, 22.5)); 
    } 


}
