package Saegus.TestJenkins;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static int addition(int a, int b){
		int result = a+b;
		System.out.println(a +" + " + b + " =  " + result);
		return result;
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World! It's Nicolas" );
        addition(1,1);
    }
}
