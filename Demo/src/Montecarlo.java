import java.util.*;
public class Montecarlo {
static Scanner sn=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int t;
		System.out.println("Enter the number of trials you want");
		t=sn.nextInt();
		System.out.println("Possiblity of getting marbles of same color from "+t+" trials is:"+marbletrials(t));
		
	}
	public static double marbletrials(int t)
	{
		int B=1,W=2;
		double number=0.0,result=0.0;
		for(int i=0;i<t;i++)
		{
			result++;
			int bowl[]= {B,B,B,W,W,W};
			int drawn[]=new int[3];
			for(int j=0;j<3;j++)
			{
				int index=(int) (Math.random()*bowl.length);
				drawn[j]=bowl[index];
				int newbowl[]=new int[bowl.length-1];
				int p=0;
				for(int q=0;q<bowl.length;q++)
				{
					if(q==index)
						continue;
					newbowl[p]=bowl[q];
					p++;
				}
				bowl=newbowl;
			}
			if(drawn[0]==drawn[1]&&drawn[1]==drawn[2])
			{
				number++;
			}
		}
		return number/result;
	}

}
