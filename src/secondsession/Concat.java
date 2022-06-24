package secondsession;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Shamala";
		String b = "Ghadi";
		String c = a+b;
		
		System.out.println(c);
		
		StringBuffer d = new StringBuffer();
		d.append(c);
		
		System.out.println(d);
	}

}
