package problem_8weeks;

import java.util.*;

public class problem7_6 {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			double logitude = Double.parseDouble(st.nextToken().trim());
			double latitude = Double.parseDouble(st.nextToken().trim());
			
			Location loc = new Location(city, logitude, latitude);
			dept.put(city, loc); 
		}			
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			String city = it.next(); 
			Location loc = dept.get(city); 

			System.out.print(loc.getCity() + "\t");
			System.out.print(loc.getLongitude() + "\t");
			System.out.println(loc.getLatitude());
		}
		System.out.println("---------------------------");		
	}

	private void processQuery() {
		while(true) {
			System.out.print("���� �̸� >> ");
			String city = scanner.nextLine(); 
			if(city.equals("�׸�"))
				return; 
			
			Location loc = dept.get(city); 
			if(loc == null) { 
				System.out.println(city + "�� �����ϴ�.");
			}
			else { 
				System.out.print(loc.getCity()  + "\t");
				System.out.print(loc.getLongitude() + "\t");
				System.out.println(loc.getLatitude());
			}
		}
	}
	public void run() {
		read();
		printAll();
		processQuery();
	}
	public static void main (String[] args) {
		problem7_6 man = new problem7_6();
		man.run();
	}
}
