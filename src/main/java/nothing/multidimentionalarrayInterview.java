package nothing;

public class multidimentionalarrayInterview {
	/*2 4 5
	  3 4 7
	  1 2 9 */
	
	//Common interview question
	//traves to the smaller number
	public static void main(String[] args) {

		int abc [][] = {{2,4,5}, {3,4,7}, {1,2,9}};
		int min=abc [0][0];
		for (int i = 0; i<3;i++) {
			for (int j=0; j<3; j++) {
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);
		
		int dec [][]={{2,4,5}, {3,4,7}, {1,2,9}};
		int max =dec[0][0];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(dec[i][j]>max) {
					max = dec[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
