package helloworld;

public class helloworld {

	public static void main(String[] args) {
	//Just testing fork functionality
		String s = "";
		String sb = "";
		if (args.length<1) s="Hello World";
		else s=args[0];
		sb=new StringBuilder(s).reverse().toString() ;

	System.out.println(s); 
	System.out.println(sb); 
	}	
}
