
public class triangle_number_array {
		 public static void main(String[] args){
		  int[][] a = { {1}, {1, 2}, {1, 2, 3} , {1, 2, 3, 4} , {1, 2, 3, 4, 5},{1, 2, 3, 4, 5, 6} ,{1, 2, 3, 4, 5, 6, 7} ,{1, 2, 3, 4, 5, 6, 7, 8} ,{1, 2, 3, 4, 5, 6, 7, 8, 9} ,{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}  };
		  for (int i = 0 ; i < a.length ; i++){
		   for (int k = 0 ; k < a[i].length ; k++){
		    System.out.print(a [ i ] [ k ]);
		   }
		   System.out.println();
		  }
		 }
	}
