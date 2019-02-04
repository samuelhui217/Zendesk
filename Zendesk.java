package zendesk;


public class Zendesk {
	
	public String before;
	public String to_change = new String();
	
	public Zendesk(String s) {
		before = new String();
		before = s;
	}
	
	public String remove() {
		String[] list = new String[3];
		to_change = before;
		list = to_change.split(">");
		list[0]=list[0].replaceAll("\n\n", "\n");
		list[0]=list[0].replaceAll("\r\n\r\n", "\r\n");
		list[1] = list[1].replaceAll("\n\n", "\n");
		list[1]=list[1].replaceAll("\r\n\r\n", "\r\n");
		list[2] = list[2].replaceAll("\n\nSubject", "\nSubject");
		return list[0] + ">" + list[1] +">" + list[2];
	}
}

