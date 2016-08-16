def quickSort(A,lo,hi):
    if(lo < hi):
        p_index = partition(A,lo,hi)
        quickSort(A, lo, p_index-1)
        quickSort(A, p_index+1, hi)
        
    
    return A
    

def partition(A,lo,hi):
    pivot = A[hi]
    p_index = lo
    
    for i in range(p_index,hi):
        if(A[i] < pivot):
            temp = A[i]
            A[i] = A[p_index]
            A[p_index] = temp
            
            p_index += 1
            
    temp = A[hi]
    A[hi] = A[p_index]
    A[p_index] = temp
    
    return p_index
    
    
A = [2,1,3,6,8,5,7,4]

res = quickSort(A, 0, len(A)-1)

print res