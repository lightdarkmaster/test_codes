def selection_sort(arr):
    # Traverse through all elements in the array
    for i in range(len(arr)):
        # Find the minimum element in remaining unsorted array
        min_index = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        # Swap the found minimum element with the first element
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr

# Sample list
numbers = [64, 25, 12, 22, 11]

# Sort the list
sorted_numbers = selection_sort(numbers)
print("Sorted array:", sorted_numbers)
