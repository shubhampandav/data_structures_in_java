package linked_list;



public class main {
	
	 public static void main(String[] args) {
		 
		
		mylinkedlist llist = new mylinkedlist();
		
		for (int i = 0; i < 10; i++) {
			llist.Add(i);
		}
			

		llist.printll();
		
		mylinkedlist new_list = new mylinkedlist();
				
				
		
		
		new_list.At_tail(24);
		new_list.At_tail(24);
		new_list.At_tail(204);
		new_list.At_tail(248);
		
		new_list.printll();
		
	 }
}
