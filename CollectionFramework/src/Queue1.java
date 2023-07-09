import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		//3-Queue-FIFO poll=remove,  offer=add
		//LinkedList
		Queue<Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.offer(20);//add element
		queue.offer(30);
		queue.add(40);
		System.out.println("Queue="+queue);
		queue.remove();//removed 1 element
		System.out.println("RemovedFirstElement="+queue);
		System.out.println("QueuePoll="+queue.poll());
		System.out.println("NewQueue="+queue);
		System.out.println("QueuePeek="+queue.peek()+"\n");
		///////////////////////////////////////////////////////////
		
		//ArrayDeque
		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		adq.offer(10);//add at 1 position
		adq.offer(20);
		adq.offerLast(30);	//added last
		adq.offerFirst(40);//first added
		System.out.println("ArrayDeque="+adq);
		adq.poll();//Removed 1 Element
		System.out.println("ArrayDequePoll="+adq);
		adq.pollLast();//Removed Last Element
		System.out.println("ArrayDeque="+adq+"\n");
		//////////////////////////////////////////////////////////////
		
		//PriorityQueue=will add minimum value at top and then random
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		//Comparator.reverseOrder() will give max heap
		pq.offer(12);
		pq.add(3);
		pq.add(4);
		pq.offer(5);
		System.out.println("PriorityQueue="+pq);
		System.out.println("PriorityQueuePeek="+pq.peek());//TopValue
		System.out.println("PriorityQueueRemove="+pq.remove());
		System.out.println("NewPriorityQueue="+pq);
		///////////////////////////////////////////////////////////////
		





		


		


	}

}
