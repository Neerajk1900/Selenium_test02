package Array_demo;

public class Array_demo1 {

	public static void main(String[] args) {
    /* find the min value of this array
     * 2 4 5
     * 3 4 7
     * 1 2 9
     * */
		int abc[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int min=abc[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				//System.out.print(abc[i][j]);
				if(abc[i][j]< min)
				{
					min=abc[i][j];
				}
			}
		}System.out.println(min);
		
		
		
		
		
		
		
	}

}
