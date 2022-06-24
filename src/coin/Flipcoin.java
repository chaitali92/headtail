package coin;
import java.util.Random;
public class Flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, h_cnt=0,t_cnt=0;
double head,tail;
Random r= new Random();
System.out.println("ENTER NUMBERS OF TIMES WE WANT TO FLIP THE COIN= ");
 n = r.nextInt();
 for (int i=0;i<n;i++)
 {
	 double random = Math.random();
	 if(random <0.5)
		 t_cnt++;
	 else
		 h_cnt++;
 }
 head= h_cnt / (double) n*100;
 tail= t_cnt / (double) n*100;
System.out.println("percentagr of head= "+head + "%");
System.out.println("percentagr of tail= "+tail + "%");

	}

}
