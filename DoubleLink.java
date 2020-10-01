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
	
	public Node DeleteLast(){
		Node temp=last;
		if(last.next==null){
			first=null;
		}else{
			last.next.previous=null;
		}
		
		last=last.next;
		return temp;
		
	}
	

	public boolean InsertAt(int data,int key){
		
		Node findnode=first;
		while(findnode.data!=key){
			findnode=findnode.next;
			if(findnode==null){
				return false;
			}
		}
		Node newinsert=new Node();
		newinsert.data=data;
		
		if(findnode==last){
			findnode.next=null;
			last=newinsert;
		}else{
				newinsert.next=findnode.next ;// add address of findnode
				findnode.next.previous=newinsert;
			}
			
			newinsert.previous=findnode;
			findnode.next=newinsert;
			return true;
		
	}
	
	public Node DeleteNodeAt(int key){
		
		Node deletenode=first;
		while(deletenode.data!=key){
			deletenode=deletenode.next;
			if(deletenode==null){
				return null;
				}
			
		}
		if(deletenode==first){
			first=deletenode.next;
		}else{
			
			deletenode.next.previous=deletenode.next;
		}
		
		if(deletenode==last){
			last=deletenode.previous;
		}else{
			last.next.previous=deletenode.previous;
		}
		return deletenode;
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
	
	public void DisplayB(){
		System.out.println("last<---first");
		Node n=last;
		
		while(n!=null){
			n.Display();
			n=n.previous;
		}
		System.out.println();
	}
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
		nodea.DisplayB();
		
		
	}
}
