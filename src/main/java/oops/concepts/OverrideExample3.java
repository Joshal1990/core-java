package oops.concepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
class Atest{
	static{
		System.out.println("static block");
	}
}
public class OverrideExample3{
	public static void main(String[] args) {
		
		
	}
}

class AXYC
{
    {
        System.out.println(1);
    }
}
 
class BTYS extends AXYC
{
    {
        System.out.println(2);
    }
}
 
class C extends BTYS
{
    {
        System.out.println(3);
    }
}
 