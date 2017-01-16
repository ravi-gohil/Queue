import java.util.*;

public class QueueExample {

	private int front, rear, size, length;
	private int queue[];
	
	QueueExample(int size){
		this.size = size;
		front = -1;
		rear = -1;
		length = 0;
	}
	
	public boolean isEmpty(){
		return front == -1;		
	}
	
	public boolean isFull(){
		return rear == size - 1 && front == 0;
	}
	
	public int getSize(){
		return length;
	}
	
	public int peek(){
		if(isEmpty()) throw new NoSuchElementException("Queue is Empty");
		return queue[front];	
	}
	
	public void insert(int n){
		
		if (rear == -1)
		{
			front = 0;
			rear = 0;
			queue[rear] = n;					
		}
		else if(rear + 1> size)
		{
			throw new IndexOutOfBoundsException("Queue is full");
		}
		else if(rear + 1< size)
		{
			queue[++rear] = n;
		}
		length++;
	}
	
	public int delete(){
		
		if(isEmpty()) throw new NoSuchElementException("Queue is already Empty");
		else
		{
			length--;
			int e = queue[front];
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front++;
			}
			return e;
		}
	}
	
	public void display(){
		
		System.out.println("Queue :");
		
		if (length == 0)
		{
			System.out.print("Empty");
			return;
		}
		for(int i =0; i<size; i++)
		{
			System.out.print(queue[i]+" ");
		}
	}
	
	
}
