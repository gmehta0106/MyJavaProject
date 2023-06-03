package javasessions;

public class AssignmentPartOne {

	public static void main(String[] args) {
		//q1 What will be the output of the following program?
				int i=11;
				i=i++ + ++i;
				System.out.println(i);	

				//q2 Guess the output of the following program?
				System.out.println("--------");
				int a=11, b=22, c;
				//System.out.println("a+b: "+ (a+b));
				//System.out.println("a++:" + a++);
				//System.out.println("b++:" + b++);
				//System.out.println("++a:" + ++a);
				//System.out.println("++b:" + ++b);
				c=a+b+ a+++ b++ + ++a + ++b;
				
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("--------");
				//q3 What will be the output of the below program?
				int ii=0;
				ii=ii++ - --ii+ ++ii -ii--;
				System.out.println("value of ii is:" +ii);
				System.out.println(ii++);//0
				System.out.println(--ii);//0
				System.out.println(++ii);//1
				System.out.println(ii--);//1
				
				//q4 Is the below program written correctly?
				System.out.println("--------");
				boolean bb = true;
				b++;//no use of b++ as bb is boolean data type 
				System.out.println("value of b:" +bb);
				
				//Q5
				System.out.println("--------");
				int e=1, j=2, k=3;
				int m=e-- -j-- - k--;
				System.out.println("e" +e);//0
				System.out.println("j"+j);//1
				System.out.println("k"+k);//2
				System.out.println("m"+m);//-4 = -1-2-3=-1-3=-4
				
				//q6
				System.out.println("--------");
				int aa=1, cc=2;
				System.out.println(--cc- ++aa+ ++cc- --aa);//1-2+2-1//-1+1=0
				
				//q7
				//System.out.println("--------");
				int q=19, jj=29, o;
				o = q-- - q++ + --jj - ++jj + --q - jj-- + ++q - jj++;
				System.out.println("q="+q );
				System.out.println("jj="+j);
				System.out.println("o="+o);
				System.out.println("--------");
				//q11
				//int aaa=11++;
				//System.out.println(aaa);
				
				
				
				
				
				
				
				
				
				
		

	}

}
