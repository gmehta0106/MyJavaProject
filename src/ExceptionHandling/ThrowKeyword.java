package ExceptionHandling;

public class ThrowKeyword {// to generate your own exception 

	public static void main(String[] args) {
		
		try {
		throw new Exception("User is not found exception");
		}catch (Exception e) {
			System.out.println("Not Found Exception");
			e.printStackTrace();
		}
		System.out.println("--------");
		String data=null;
		if(data==null);
		try {
			throw new Exception("DataNotFoundException");
			}catch (Exception e) {
				System.out.println("Not Found Exception");
				e.printStackTrace();
			}
		try {
		System.out.println(data.length());
	}catch(NullPointerException e) {
		System.out.println("data length cannot find");
		//e.printStackTrace();
		}
		System.out.println("bye");
	}

}
