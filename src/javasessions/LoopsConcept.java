package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1 to 100
//	for(int i=1;i<=10;i++) {
//	System.out.println(i);	
//i++;
//	}
//	
//	for(;;) {//if no code there it consider True and genrate the infinte loop
//		System.out.println("labs");
//	}
		//print ascii value 
//	for(char ch='A';ch<='Z';ch++) {
//		System.out.println(ch+"="+(byte)ch);
//	}
//	//print a to z
//	for(char ch='a';ch<='z';ch++) {
//		System.out.println(ch);
//	}
	int i= 1;
	while (true)
	{
		System.out.println(i+" =Naveen");
		if(i==100) {
			break;
		}i++;
	}
	
//int i = 1;
//while(i<10) {
//	System.out.println(i);
//	i++;
//	//i=i+1;
//	//i=++i
//	//i=i+2
//	//i=i+10
//}
//infinite times without if condition and break
//}

//infinite scrolling on linkedin 
//display welcome to Taj Hotel on hotel board infinite time 
	
//	for(double d=1.1;d<=5.1;d++) {
//		System.out.println(d);
//	}
//	for (int w=1;w<=10;w++) {
//	if(w%2==0) {
//		System.out.println("print even numbers"+w);
//	}	
//	}
//	int e=1;
//	do {
//	
//		System.out.println(e);
//		e++;
//		
//	}
//	while(e>=10);//it will run 1 time only as 2 is not greater then 10 means it will run only 1 time 
	int e=1;
	do {
		e++;//2
		System.out.println(e);
		//break;//it will break and print only 2
		
	}
	while(e<=10);//output 2 to 11 as e++ position is different  
}}
