package core_java;

public class TypeDemo {
public static void main(String[] args) {
	int i1=1000000000; //4 byte
	long l1=10000000000l;//8 byte
	byte b1=127;//1 byte
	char c1='T';//2 byte
	
	float f1=12.34f; //4 byte
	double d1=12.324324;//8 byte
	
	boolean bb=true; //1 bit
	
	System.out.println("integer: "+i1);
	System.out.println("long:"+l1);
	System.out.println("byte:"+b1);
	System.out.println("char:"+c1);
	System.out.println("float:"+f1);
	System.out.println("double:"+d1);
	System.out.println("boolean:"+bb);
	
	System.out.println("size of integer:"+Integer.BYTES + "bytes");
	System.out.println("size of long:"+Long.BYTES + "bytes");
	System.out.println("size of byte:"+Byte.BYTES + "bytes");
	System.out.println("size of char:"+Character.BYTES + "bytes");
	System.out.println("size of flaot:"+Float.BYTES + "bytes");
	System.out.println("size of double:"+Double.BYTES + "bytes");
	
}
}
