class RobotUniquePaths{

	public static void main(String[] args){

            int res = uniquePaths(3, 3);
            System.out.println(res);

	}


	public static int uniquePaths(int a, int b) {

		int res = uniquePathsBinaryTree(a-1,b-1,0);

		return res;
		
	}

	public static int uniquePathsBinaryTree(int i, int j,int cnt){
		
		if(i == 0 && j == 0)
            return cnt+1;
                
		if((i-1) >= 0)
			cnt = uniquePathsBinaryTree(i-1, j, cnt);		
		if((j-1) >= 0)
			cnt = uniquePathsBinaryTree(i, j-1, cnt);		
                
		return cnt;

	}

}