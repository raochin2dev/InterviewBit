public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	      
	      int N = a.size();
          int L = 0;
          int R = N - 1;
          int key = b;
          while (L <= R) {
            // Avoid overflow, same as M=(L+R)/2
            int M = L + ((R - L) / 2);
            if (a.get(M) == key) return M;
        
            // the bottom half is sorted
            if (a.get(L) <= a.get(M)) {
              if (a.get(L) <= key && key < a.get(M))
                R = M - 1;
              else
                L = M + 1;
            }
            // the upper half is sorted
            else {
              if (a.get(M) < key && key <= a.get(R))
                L = M + 1;
              else 
                R = M - 1;
            }
          }
          return -1;
	    
	}

}
