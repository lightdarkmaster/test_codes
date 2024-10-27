def bubble_sort(myNum):
    n = len(myNum)
    for i in range(n):
        for j in range(0, n-i-1):
            if myNum[j] > myNum[j+1]:
                myNum[j], myNum[j+1] = myNum[j+1], myNum[j]

# Example usage
myNum = [64, 34, 25, 12, 22, 11, 90]
bubble_sort(myNum)
print("Sorted array is:", myNum)

#bubble sorting algorithm in python
