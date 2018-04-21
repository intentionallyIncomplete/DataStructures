public class StackInterface {

	/****************************************************/
	/* 					class variables					*/
	/* stackArr will hold the objects					*/
	/* top is the "next" layer in the stack				*/
	/* numOfLayers is the 'size' of the array			*/
	/****************************************************/
	private Object[] stackArr = new Object[5];
	private int top = 0;
	private int numOfLayers;

	/*******************************************************/
	/* will take in args to ctor for setting size of array */
	/*******************************************************/
	public StackInterface(int stackSize){
		this.numOfLayers = stackSize;
		this.stackArr = new Object[stackSize];
	}

	/*****************************************************/
	/* takes in an object as a parameter then checks if	 */
	/* the stack, with one more layer, would be greater	 */
	/* than the stack size, if so, it's full and we can't*/
	/* add to it. If it's not empty and we can add		 */
	/* another without going over, then add the object	 */
	/*****************************************************/
	public void push(Object aLayer){
		if(top + 1 < numOfLayers){
			top++;
			stackArr[top] = aLayer;
		} else System.out.println("stack full");
		show();
		System.out.println("the layer: " + aLayer + " was pushed successfully");
	}

	/******************************************************/
	/* as long as the top layer in the stack has a value  */
	/* take it out from the stack of layers by decrementing*/
	/* the top stack. Effectively setting the top stack to*/
	/* the value after decrementing						  */
	/******************************************************/
	public Object pop(){
		if(top >= 0){
			System.out.println("the layer: " + stackArr[top] + 
					" has been removed successfully");
			return stackArr[top--];
		} else {

			System.out.println("no layers, stack is empty");

			return "-1";
		}
	}

	/*****************************************************/
	/* returns the top layer of the stack */
	/*****************************************************/
	public Object peek(){
		System.out.println("top layer: " + stackArr[top]);
		return stackArr[top];
	}

	/******************************************************/
	/* a for-each loop to display the stack after certain */
	/* actions are executed								  */
	/******************************************************/
	public void show(){
		for(Object i : stackArr){
			System.out.println(i + " ");
		}
	}

	//works the same as the QueueInterface class
	public boolean equal(Object that){
		if(this == that){
			return true;
		}else{
			return false;
		}
	}
	
	//works the same as the ArrayListLike class
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		while(stackArr[top] != null){
			sb.append(" ").append(stackArr[top]);
		}
		return sb.toString();
	}
}
