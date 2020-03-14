import java.util.Random;

public class MathOps{
	public static void main(String[] args){
		Random random = new Random(47);
		int i,j,k;
		
		j = random.nextInt(100)+1;
		SysDim.print("j " + j);
		i = random.nextInt(100)+1;
		SysDim.print("i " + i);
		k = j+i;
		SysDim.print("k " + k);
		k = j*i;
		SysDim.print("k " + k);
			k = j/i;
		SysDim.print("k " + k);
			k = j-i;
		SysDim.print("k " + k);
	}
}