import java.util.Scanner;
import java.util.Stack;

public class Main {
public static void main(String[] args) {
	Stack<Integer> carts = new Stack<Integer>();
	Scanner sc = new Scanner(System.in);
	int cartNo= sc.nextInt();
	int trial=sc.nextInt();
	int counter=0;
	carts.push(trial);
	while(counter==0) {
		for(int i=0; i<cartNo-1; i++) {
			carts.push(sc.nextInt());
		}
		int lastCart=carts.pop();
		boolean couldBe=false;
		int count=0;
		for(int j=0; j<cartNo-1; j++) {
			int newCart = carts.pop();
			if(lastCart==newCart+1||lastCart==newCart-1&&count==0) {
				couldBe=true;
			}else{
				couldBe=false;
				count++;
			}
			lastCart=newCart;

		}
		if(couldBe) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		count=0;
		trial=sc.nextInt();
		if(trial==0) {
			System.out.println();
			cartNo=sc.nextInt();
			if(cartNo==0) {
				counter++;
			}else {
			carts.push(sc.nextInt());
			}
		}else {
			carts.push(trial);
		}
	}
}
}
