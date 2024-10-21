package assignment2110;

public class SingleLL {
	Node root;
	 void create_list() 
	 {
		 root = null;
	 }
	    void insert_last(int data) {
	        Node n = new Node(data);
	        if (root == null)
	            root = n;//n becomes 1st so root=
	        else {
	            Node t = root;
	            while (t.next != null) {
	                t = t.next;
	            }
	            t.next = n;
	        }
	        System.out.println(root.data + " inserted");

	    }	   

	    void print_list() {
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node t = root;
	            while (t != null) {
	                System.out.print("|" + t.data + "|->");
	                t = t.next;
	            }
	        }
	    }

	    void search_list(int data) {
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node t = root;
	            while (t != null) {
	                if (t.data == data)//match found
	                {
	                    System.out.println(t.data + " found in list");
	                    break;
	                }
	                t = t.next;
	            }
	            if (t == null)//not found
	                System.out.println(data + " not found in list");
	        }
	    }

}
