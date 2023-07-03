import java.util.*;
public class travel_tcsnqt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0, y = 0,d = 10;
		char c = 'R';
		while(n > 0){
		    switch(c){
		        case ('R'):
		            x += d;
		            c = 'U';
		            break;
		        case ('U'):
		            y += d;
		            c = 'L';
		            break;
		       case ('L'):
		            x -= d;
		            c = 'D';
		            break;
		        case ('D'):
		            y -= d;
		            c = 'A';
		            break;
		        case ('A'):
		            x += d;
		            c = 'R';
		            break;
		    }
		    d+= 10;
		    n--;
		}
		System.out.println(x+" "+y);
		
	}
}

