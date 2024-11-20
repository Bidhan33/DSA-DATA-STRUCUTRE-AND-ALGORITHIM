
def printNGE(arr):

    for i in range(0, len(arr), 1):

        next = -1
        for j in range(i+1, len(arr), 1):
            if arr[i] < arr[j]:
                next = arr[j]
                break

        print(str(arr[i]) + " -- " + str(next))


# Driver program to test above function
arr = [11, 13, 21, 3]
printNGE(arr)

# Soln no 2 py   : few questions regarding this 
# What value is printed if no greater element exists for an array element?
# How does the inner loop (for j in range(i+1, len(arr), 1)) contribute to finding the next greater element?
 # What is the role of the break statement in the code?
