
/**
 * @author gehu
 *
 */
public class Fibonnaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int f = 0;
		int s = 1;
		int next, c;
		for(c=0;c<n;c++) {
			if(c <= 1)
				next = c;
			else {
				next = f + s;
				f = s;
				s = next;
			}
			System.out.println(next);
		}
	}

}
