

	class Node
	{
	   private int data;
	   private Node next;

	   public Node(int data, Node next)
	   {
	      this.data = data;
	      this.next = next;
	   }
	
	
	public void printList() {
		
		Node n = this;
		while (n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
}
