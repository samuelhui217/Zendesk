package zendesk;


public class Tester {

	public static void main(String[] args) {
		
		
			Zendesk test1 = new Zendesk("From: \"Cliff Clavin\"<cliff@cheers.com>\n\nTo: \"Randall Flagg\" <walkindude@lasvegas.com>\n\nMade it!!!!\n\nYay!");
			Zendesk test2 = new Zendesk("From: \"Cliff Clavin\"<cliff@cheers.com>\n\nTo: \"Randall Flagg\" <walkindude@lasvegas.com>\n\nSubject: What! What!\n\nMade it!!!!\n\nYay!");
			Zendesk test3 = new Zendesk("From: \"Cliff Clavin\"<cliff@cheers.com>\nTo: \"Randall Flagg\" <walkindude@lasvegas.com>\n\nMade it!!!!\n\nYay!");
			Zendesk test4 = new Zendesk("From: \"Cliff Clavin\"<cliff@cheers.com>\r\n\r\nTo: \"Randall Flagg\" <walkindude@lasvegas.com>\r\n\r\nSubject: What! What!\r\n\r\nMade it!!!!\r\n\r\nYay!");
			Zendesk myTest = new Zendesk("From \"Sam\"<Sam@gmail.com>\n\n\n\nTo: \"Dan\" <Dan@gmail.com>\n\n\n\nReminder\n\nHW due Tuesday");
			
			System.out.println("Unit Test 1 \n");
			System.out.println("input: \n" + test1.before +"\n");
			System.out.println("output: \n" + test1.remove()+ "\n");
			
			System.out.println("-----------------------------------------------------");
			
			System.out.println("Unit Test 2 \n");
			System.out.println("input: \n" + test2.before +"\n");
			System.out.println("output: \n" + test2.remove() + "\n");
			
			System.out.println("-----------------------------------------------------");
			
			System.out.println("Unit Test 3 \n");
			System.out.println("input: \n" + test3.before +"\n");
			System.out.println("output: \n" + test3.remove()+ "\n");
			
			System.out.println("-----------------------------------------------------");
			
			System.out.println("Unit Test 4 \n");
			System.out.println("input: \n" + test4.before +"\n");
			System.out.println("output: \n" + test4.remove()+ "\n");
			
			System.out.println("-----------------------------------------------------");
			
			System.out.println("My Test \n");
			System.out.println("input: \n" + myTest.before +"\n");
			System.out.println("output: \n" + myTest.remove()+ "\n");
		
		
		
			
	}
}
