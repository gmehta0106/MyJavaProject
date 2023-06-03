package Assignments;

public class Loop_Concept1 {

	public static void main(String[] args) {
		//1.WAP to print I am Batman 5 times
		String s= "I am Batman";
		for (int i=0;i<5;i++) {
			System.out.println(s);
		}
		System.out.println("----------------");
		//2.WAP to print I am Batman 9 times with numbers at the end
		    for(int i=1;i<=9;i++) {
			System.out.println("I am Batman" + " " + i);
		}System.out.println("Using for loop----------------");
		//3.WAP to print 10 to 1 using for, while and do while loop
		    for (int i=10;i>0;i--) {
		    	System.out.println(i);
		    }System.out.println("Using while loop----------------");
		//3.2 while loop    
		    int i=10;
		    while(i>0) {
		    	System.out.println(i);
		    	i--;
		    }System.out.println("Using Do while loop----------------");
		//3.3 Do while loop
		    int k=11;
		    do{
		    	k--;
		    	System.out.println(k);
		    }
		    while(k>1);
		    
		    System.out.println("----------------");
			
		//4. Write a program to print "Hello world" 10 times while loop
		    int counter=1; 
			while(counter<11) {
			System.out.println("Hello World");
			counter++;
	        }System.out.println("multiplication of 5 from 1 to 100 using for loop----------------");
		//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
			for(int multi=0;multi<=20;multi++) {
				int result =multi *5;
				System.out.println(result);
			}System.out.println("multiplication of 5 from 1 to 100 using while loop----------------");
		//5.1 using while loop
			int times = 0;
			while(times<=20) {
				int result = times *5;
				System.out.println(result);
				times ++;
			}System.out.println("multiplication of 5 from 1 to 100 using do while loop----------------");
		//5.2 Using do while loop
			int t=0;
			do {
				t++;
				int result=t*5;
				System.out.println(result);
				}
				while(t<20); {
				
				}System.out.println("odd and even numbers------------");
		//6. print all odd and even numbers between 1 to 100
				
				for (int r=1;r<=100;r++) {
				if (r%2==0)
					System.out.println("This is even number: " +r);
				else {
					System.out.println("This is odd number: " +r);
					
				}}
		//7. What will be the output of this program 		
//				int p = 1;
//
//				while(p<=1){
//
//				System.out.println("Hi Java");//infinite loop to print hi java "ask Naveen why"
	
		//8.Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop
				System.out.println("ascii value of 0 to 9 with for loop------------");
				for(char ch='0';ch<='9';ch++) {
				System.out.println(ch + "=" + (byte)ch);
				}
	
				System.out.println("ascii value of a to z with for loop------------");
				for (char ch1='a';ch1<='z';ch1++) {
				System.out.println(ch1 + "=" + (byte)ch1);
				}
				System.out.println("ascii value of A to Z with for loop------------");
				for (char ch2='A';ch2<='Z';ch2++) {
				System.out.println(ch2 +"="+ (byte)ch2);
				
	}           System.out.println("ascii value of 0 to 9 with while loop------------"); 
	            char e='0';
	            while(e<='9') {
	            	System.out.println(e + "=" + (byte)e);
	            	e++;
	            }
				System.out.println("ascii value of a to z with while loop------------"); 
		        char ch4='a';
		        while(ch4<='z')
		        {System.out.println(ch4 +"=" + (byte)ch4);
		        ch4++;
		        }
		        
		        System.out.println("ascii value of A to Z with while loop------------");
		        char ch5='A';
		        while(ch5<='Z') {
		        	System.out.println(ch5 + "=" + (byte)ch5);
		        	ch5++;
		        }
		        
		        System.out.println("Print the following series: 1.0 2.0 3.0  ...... 10.0 ");
		        //9. Print the following series: 1.0 2.0 3.0  ...... 10.0 
		        for (double series=1.0;series<=10.0;series++) {
		        System.out.println(series);
		        }
		        
		        System.out.println("Print the following series:0 9 18 27 36 …99");
		        //9.1Print the following series: 0 9 18 27 36 …99
		        for(int s1=0;s1<=11;s1++) {
		        	int result = s1*9;
		        	System.out.println(result);
		        }
		        System.out.println("------Print only vowels (aeiou)--------with for loop");
		        //10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		        for (char vowels='a';vowels<='z';vowels++) {
		        	if(vowels=='a'||vowels=='e'||vowels=='i'||vowels=='o'||vowels=='u') {
		        	System.out.println(vowels);
		        	}
		        System.out.println("-------Print only vowels (aeiou) using while loop. Start the loop from ‘a‘ to ‘z‘");
		        //10.1 Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		        	char vowels1='a';
		        	while (vowels1<='z') {
		        		if(vowels1=='a'|| vowels1=='e' || vowels1=='i'|| vowels1=='o' || vowels1=='u')
		        		System.out.println(vowels1);
		        		vowels1++;
		        	} 
		        //10.2 Print vowels and consonant using switch case
		        	char c6='n';
		        	switch(c6) {
		        	case'a':
		        	case'e':
		        	case'i':
		        	case'o':
		        	case'u':
		        		System.out.println(c6 + " :is a vowel");
		        		default:System.out.println("consonant");
		        		break;
		        	}System.out.println("---------Print 1 to 10 and break the loop once you find the multiplication of 7 with bye, see you tomorrow");
		        //11.Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		            for (int j=1;j<=10;j++) {
		            	if (j%7==0)
		            	System.out.println(j + "Bye see you tomorrow");
		            }
		        }
	}
	
	
}
			
			




