package javasessions;

public class IncrementAndDecrementOprators {

	public static void main(String[] args) {
		// increase the value by 1  "++" and "--"
		int a=1;
		int b=a++;
		
		int v=-99;
		int vv=++v;
		System.out.println(v);
		System.out.println(vv);
		int pop=2;
		System.out.println(pop++);//2 why because of post increment 
System.out.println(pop);
System.out.println(++pop);
int loop=2;
System.out.println(++loop);
System.out.println(loop);

int amt=10;
int finalamt=amt+1;
int finalamt1=amt+4;

System.out.println(finalamt);
//post decrement
int tt=2;
int pp=tt--;
System.out.println(tt);
System.out.println(pp);

int rest=-99;
int api=rest--;
System.out.println(rest);
System.out.println(api);
//pre decrement 

int aa = 2;
int bb=--aa;
System.out.println(aa);
System.out.println(bb);

int s1=-1000;
int s2=--s1;
System.out.println(s1);
System.out.println(s2);

int s3=40;
System.out.println(s3--);
System.out.println(s3);
System.out.println(--s3);

int p3=50;
System.out.println(--p3);
System.out.println(p3);

System.out.println(p3+1);

int na=1;
System.out.println(na);//1
int test =na++ +na++ + na++ + na++;
System.out.println(test);//10
System.out.println(na);//5
}

}
