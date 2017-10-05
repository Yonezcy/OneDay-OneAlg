__author__ = 'zcy'

def swap(a, b):
    t = a
    a = b
    b = t
    return a, b

def permutation(array, begin, end):
    '''get the permutation of array implemented by recursion

    :param array: input array
    :param begin: begin pointer
    :param end: end pointer
    :return: null
    '''
    if begin == end:
        for i in range(end):
            print array[i], ' '
        print '\n'
        return

    for i in range(begin, end):
        array[i], array[begin] = swap(array[i], array[begin])
        permutation(array, begin+1, end)
        array[begin], array[i] = swap(array[begin], array[i])

if __name__ == '__main__':
    arr = [1, 2 ,3 ,4]
    permutation(arr, 0, 4)