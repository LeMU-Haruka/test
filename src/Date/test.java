package Date;

public class test {
	public static void main(String [] args){
	Date x= new Date(1,1,2002);
	Date y= new Date(2,2,2002);
	Date z= new Date();
	Date zz= z;
	System.out.println("x is " + x );
	System.out.println("z is " + z );
	System.out.println("x == z is " + (z==x));
	System.out.println("x equals z is " + (z.equals(x)));
	System.out.println("y is " + y );
	System.out.println("z is " + z );
	System.out.println("y == z is " + (z==y));
	System.out.println("y equals z is " + (z.equals(y)));
	System.out.println("zz is " + zz );
	System.out.println("z is " + z );
	System.out.println("zz == z is " + (z==zz));
	System.out.println("zz equals z is " + (z.equals(zz)));	
	}
}
