package assignment2110;

import java.util.Scanner;

public class DubblyLinkedList {
	Dnode root;

	void create_list() {
		root = null;
	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null)
			root = n;
		else {
			Dnode t = root;
			while (t.right != null) {
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
		System.out.println(data + " inserted");

	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = root;
			while (t != null) {
				if (t.data % 2 == 1)
					System.out.print("<-|" + t.data + "|->");
				t = t.right;
			}
		}
	}

	public static void main(String[] args) {
		DubblyLinkedList obj = new DubblyLinkedList();
		Scanner sc = new Scanner(System.in);
		obj.create_list();
		obj.insert_right(1);
		obj.insert_right(2);
		obj.insert_right(3);
		obj.insert_right(4);
		obj.print_list();

	}
}
