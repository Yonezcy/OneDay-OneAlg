__author__ = 'zcy'

def permutation(array, begin, end):
    '''get the permutation of array

    :param array: input array
    :param begin: begin pointer
    :param end: end pointer
    :return: null
    '''
    if begin == end:
        for i in range(end):
            print(array[i] )
        return

    for i in range(begin, end):
        swap(array[i], array[begin])
        permutation(array, begin+1, end)
        swap(array[begin], array[i])

    return
