import java.util.*;

class ConcentrenicRectangle{

	public static void main(String[] args){

		ArrayList<ArrayList<Integer>> ans = prettyPrint(4);
		for (int i=0; i < ans.size(); i++ ) {
			System.out.println(ans.get(i));
		}

	}

	public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {

		int n = 2*a-1;
		int subtractVal;
                int row = 0;
                int col = 0;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for(int i = 0; i < n ; i++){
			ArrayList<Integer> tempres = new ArrayList<>();
			for(int j = 0; j < n ; j++){
                                
				subtractVal = (row < col)?row:col;
				tempres.add(a-subtractVal);
                                
                                if(j >= (n/2)){
                                    col--; 
                                 }
                                 else{
                                    col++;
                                 }

			}
                        col = 0;
                        if(i >= (n/2)){
                           row--; 
                        }
                        else{
                           row++;
                        }
                        
			res.add(tempres);

		}
            
            return res;
	}

}