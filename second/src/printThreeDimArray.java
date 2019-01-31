
public class printThreeDimArray {

	public static void main(String[] args) {
		int[][] a1 = {
				{10, 20, 30},				//0
				{10, 20, 30, 40, 50},		//1
				{10, 20},					//2
				{10, 20, 30, 40},			//3
				{10}						//4
			 };	
		for (int i = 0; i < a1.length; i++) {
		    for (int j = 0; j <a1[i].length; j++) {
		        System.out.println(a1[i][j]+" ");
		    }
		}
	}
}