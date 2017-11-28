class Node {
	public Object data;
	public Node next;

	public Node(){

	}

	public Node(Object data, Node next){
		this.data = data;
		this.next = next;
	}
}

public class LinkedList {
	private Node head;
	private int size = 0;
	public LinkedList(){
		head = new Node();
	}

	public static void main(String[] args) {
		LinkedList x = new LinkedList();
		x.add(new Integer(5));
		x.add(new Integer(6));
		x.add(new Integer(7));
		x.add(new Integer(8));
		x.print();
	}

	void add(Object value){
		head.data = value;
		head.next = new Node();
		size++;
	}

	void addAt(int index, Object value){
		if (this.size > index){
			throw new IllegalArgumentException("IndexOutOfBounds");
		}
		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		Node dataNode = new Node(value, temp.next);
		temp.next = dataNode;
		size++;
	}

	public void print(){
		while (head.next != null){
			System.out.println(head.data);
		}
	}

	Object remove(Object o){
		Node previous = this.head;
		Node dataNode;
		for (int i = 0; i < size; i++) {
			Node temp = previous.next;
			if (temp.data.equals(o)){
				dataNode = temp;
				previous.next = temp.next;
				return dataNode;
			}
			previous = previous.next;
		}
	}
}