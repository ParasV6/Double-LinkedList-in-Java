class Node{
	
	Node next;
	Node previous;
	int data;
	
	public void Display(){
		System.out.print("{" +data+ "}");
	}
}


class UtilDl{
	
	
	Node first;
	Node last;
	
	public void InsertFirst(int data){
		
		Node newnode=new Node();
		newnode.data=data;
		
		
		if(first==null)
		{
			last=newnode;
		}
		else{
			first.previous=newnode;
		}
		newnode.next=first;
		first=newnode;
	}
	
	public void InsertLast(int data){
		
		Node lastnode=new Node();
		lastnode.data=data;
		
		
		if(last==null){
			first=lastnode;
		}else{
			last.next=lastnode;
			lastnode.previous=last;
		}
		last=lastnode;
	}
	
	public Node Delete(){
		Node temp=first;
		if(first.next==null){
			last=null;
		}
		 else{
		
		first.next.previous=null;	
		}
		first=first.next;
		
		return temp;
		
	}
	
	

	public void Display(){
		System.out.println("first--->last");
		Node n=first;
		
		while(n!=null){
			n.Display();
			n=n.next;
		}
		System.out.println();
	}
	

class DoubleLink{
	
	public static void main(String []args){
		
		
		UtilDl nodea=new UtilDl();
		nodea.InsertFirst(20);
		nodea.InsertFirst(30);
		nodea.InsertFirst(40);
		nodea.InsertFirst(50);
		nodea.InsertFirst(70);
		nodea.Display();
		
		
		
	}
}
