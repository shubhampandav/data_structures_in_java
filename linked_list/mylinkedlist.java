
package linked_list;

class mylinkedlist{
	
	
	 node head;
	 node tail;
	 
	 /**
	  *  this method add element at first
	  * @param data
	  */
	 public void Add(int data) {
		 node new_node = new node(data);
		 
		 if (head ==null) {
			 head =new_node;
			 
			
		} else {
			
			node temp = head;
			head =new_node;
			head.next = temp;

		}
			
		}
	
	 
	 
	 
	 public void At_tail(int data) {
		 
		 node n = new node(data);
		 
		if (head==null) {
			tail = n;
			head =n;
			
		} else {
         
			
			tail.next =n;
			tail = n;
			
			
			
		}
	 }
		 
	 
	 /**
	  * this is showing element of list
	  */
		 public void printll() {
			 
			if (head==null) {
				
				System.out.println("list is Empty ");
				
			} else {
				
				node temp = head;
				
				while(temp!=null) {
					
					System.out.println(""+temp.data);
					temp = temp.next;
				}

			}
		 
		 }
	 }
	 
