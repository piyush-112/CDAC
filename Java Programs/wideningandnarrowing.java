
public class wideningandnarrowing {
public static void main(String[] args) {
	byte b=10;
	short s=10;
	int i=10;
	long l=10;
	float f=10;
	double d=10;
	char c=10;
	boolean bl=true;
	
	b=(byte)s;
	s=b;
	l=b;
	f=b;
	c=(char)b;
	bl=bl;
	
}
}
