# 和直接插入排序的区别在于while循环处不用比较那么多次
def BinSort(r, length):
    for i in range(2, length):
        x = r[i]
        # left为要插入的位置
        left = 1; right = i - 1
        while left <= right:
            mid = (left + right) / 2
            if x < r[mid]: right = mid - 1
            else: left = mid + 1

        j = i - 1
        while j >= left:
            r[j+1] = r[j]
            j = j - 1
        r[left] = x

    return r