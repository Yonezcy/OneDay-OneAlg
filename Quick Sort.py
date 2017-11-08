# 快速排序
def quicksort(r, left, right):
    if left < right:
        i = partition(r, left, right)
        quicksort(r, left, i-1)
        quicksort(r, i+1, right)

def partition(r, left, right):
    zhuyuan = r[left]

    while left < right:
        while left < right and r[right] >= zhuyuan:
            right = right - 1
        if left < right:
            r[left] = r[right]
            left = left + 1
        while left < right and r[left] < zhuyuan:
            left = left + 1
        if left < right:
            r[right] = r[left]
            right = right - 1

    r[left] = zhuyuan
    return left

if __name__ == '__main__':
    r = [0 ,17,5,14,67,45,6,97,34]
    r = BinSort(r, 9)
    print(r)