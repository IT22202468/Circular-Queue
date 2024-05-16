package circular;

public class Cqueue {

	private int rear;
	private int front;
	private char queueArr[];
	private int maxSize;
	private int noItems;
	
	public Cqueue(int s) {
		this.maxSize = s;
		rear = -1;
		front = 0;
		noItems = 0;
		queueArr = new char[s];
	}
	
	public boolean isFull() {
		return (noItems == maxSize);
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public void insert(char j) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(rear == maxSize -1) {
				rear = -1;
			}
			rear++;
			queueArr[rear] = j;
			noItems++;
		}	
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		else {
			char temp = queueArr[front];
			front++;
			
			if(front == maxSize) {
				front = 0;
			}
			
			noItems--;
			return temp;
		}
	}
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		else {
			return queueArr[front];
		}
	}
}
