import java.util.ArrayList;
import java.util.List;

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		System.out.println(fab(5));
	}
	public static int fab(int a)
	{
		if(a==1)
		return 0;
		else if(a==2)
		return 1;
		else
			return fab(a-1)+fab(a-2);
	}
	
}
