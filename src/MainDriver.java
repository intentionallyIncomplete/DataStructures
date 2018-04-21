import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/*******************************************************/
/* Ian Bryan - Main Driver for the other three classes */
/*******************************************************/

public class MainDriver {

	public static void main(String[] args) {
		stackTests();
		queueTests();
		arrayListTests();
	}

	private static void arrayListTests() {
		ArrayListLike a = new ArrayListLike(1);
		System.out.println(a.toString());
//		while(a.isEmpty() == false) {
//			System.out.println(a.remove(0));
//		}
	}

	private static void queueTests() {
		QueueInterface a = new QueueInterface(10);
		System.out.println(a.toString());
//		while(a.isEmpty() == false) {
//			System.out.println(a.dequeue());
//		}
	}

	private static void stackTests() {
		StackInterface a = new StackInterface(10);
		
		System.out.println(a.toString());
		
		/*****************************************************/
		/* the checking for empty stacks is actually handled */
		/* dynamically when pushing, popping.				 */
		/*****************************************************/
		
//		while(a.isEmpty() == false) {
//			System.out.println(a.pop());
//		}
	}
}
