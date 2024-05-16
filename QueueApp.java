package circular;

public class QueueApp {

	public static void main(String[] args) {
		
		Cqueue q1 = new Cqueue(4);
		
		q1.insert('l');
		q1.insert('m');
		q1.insert('n');
		q1.insert('o');

		while(!q1.isEmpty()) {
			System.out.println(q1.remove());
		}
	}

}
