def insertionSort(A):
    for i in range(1,len(A)):
        
        ptr = i;
        while(ptr > 0 and A[ptr] < A[ptr-1] ):
            temp = A[ptr]
            A[ptr] = A[ptr-1]
            A[ptr-1] = temp
            ptr = ptr -1
    
    return A
A = [5,4,3,2,1]

A = insertionSort(A);
print(A)