# 快速排序
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
