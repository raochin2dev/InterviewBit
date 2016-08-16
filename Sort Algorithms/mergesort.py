def mergeSort(A):
    
    sizeA = len(A)
    
    if(sizeA == 1):
        return A

    leftPart = mergeSort(A[0:(sizeA/2)])
    rightPart = mergeSort(A[(sizeA/2):sizeA])
    
    res = mergeFn(leftPart,rightPart)
    
    return res

# Merge both paritions comparing values from left & right , adding the smallest elements to new result array 
def mergeFn(left,right):
    
    k = 0
    i = 0
    j = 0
    size = len(left)
    res = []
#    print "Merge",left,right,size
    
    while(i < size and j < size):
        if(left[i] <= right[j]):
            res.append(left[i]) 
            i += 1
        else:
            res.append(right[j])
            j += 1

        print res
        
    while(i < size):
        res.append(left[i]) 
        i += 1

    while(j < size):
        res.append(right[j]) 
        j += 1


    return res


A = [2,4,1,6,8,5,3,7]
res = mergeSort(A)

print res