
public class 문제_6 {
static void method6(String s)
{
	/*for(int i = s.length()-1;i>=0;i--))
{
	System.out.println(s.charAt(i);
}*/
StringBuffer sb=new StringBuffer();
sb.append(s);
String ss= sb.reverse().toString();
System.out.println(ss);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method6();
	}

}
