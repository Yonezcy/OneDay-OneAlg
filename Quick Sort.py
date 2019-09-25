import random

# quick sort
def quicksort(r, left, right):
    if left < right:
        i = partition(r, left, right)
        quicksort(r, left, i-1)
        quicksort(r, i+1, right)

def partition(r, left, right):
    p = r[left]
    while left < right:
        while left < right and r[right] >= p:
            right = right - 1
        if left < right:
            r[left] = r[right]
            left = left + 1
        while left < right and r[left] < p:
            left = left + 1
        if left < right:
            r[right] = r[left]
            right = right - 1
    r[left] = p
    return left

if __name__ == "__main__":
    nums = [i for i in range(100)]
    random.shuffle(nums)
    print nums
    quicksort(nums, 0, 99)
    print nums
