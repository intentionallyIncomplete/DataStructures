public class QueueInterface {

	/*****************************************************/
	/* 					class variables					 */
	/* queueArr for the queue of objects, next for the 	 */
	/* next queued item, numQueues is the total number of*/
	/* queues for checking if the queue is empty, last 	 */
	/* for the last out item, and queueSize for the length*/
	/*****************************************************/
	private Object[] queueArr = new Object[5];
	private int next;
	private int numQueues;
	private int last = 0;
	private int queueSize;

	/*****************************************************/
	/* ctor, works the same as the StackInterface class  */
	/*****************************************************/
	public QueueInterface(int queueSize){
		this.numQueues = queueSize;
		this.queueArr = new Object[queueSize];
	}

	/*****************************************************/
	/* same functionality as StackInterface push()		 */
	/*****************************************************/
	public void enqueue(Object nextQueue){
		if(numQueues + 1 <= queueSize){
			queueArr[last] = nextQueue;
			last++;
			numQueues++;
			System.out.println("the item: " + queueArr[last] + " was added successfully");

		} else {
			System.out.println("queue full");
		}
	}

	/*****************************************************/
	/* works the same as StackInterface					 */
	/*****************************************************/
	public void dequeue(){
		if(numQueues > 0){
			System.out.println("the item: " + queueArr[next] + " was taken out");
			queueArr[next] = "-1";
			next++;
			numQueues--;
		} else {
			System.out.println("Sorry But the Queue is Empty");
		}
	}

	/*****************************************************/
	/* only checks for the latest or "next" queue, which */
	/* really means we are looking at the item to be popped*/
	/* out next if the pop() method is called			 */
	/*****************************************************/
	public Object peek(){
		System.out.println("top layer: " + queueArr[next]);
		return queueArr[next];
	}

	public void show(){
		for(Object i : queueArr){
			System.out.println(i + " ");
		}
	}

	public boolean equal(Object that){
		if(this == that){
			return true;
		}else{
			return false;
		}
	}

	/*****************************************************/
	/* works the same as for StackInterface				 */
	/*****************************************************/
	public String toString(){
		StringBuilder sb = new StringBuilder();

		while(queueArr[next] != null){
			sb.append(" ").append(queueArr[next]);
		}
		return sb.toString();
	}
}