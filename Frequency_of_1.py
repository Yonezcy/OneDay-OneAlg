__author__ = 'zcy'

def count(n):
    '''count the frequency of '1' in order sequence 1~n

    :param n:input number, type:integer
    :return:the frequency of number '1'
    '''

    if n < 1: return 0
    # frequency
    count = 0
    # weight of bit
    base = 1
    round = n

    while round > 0:
        weight = round % 10
        round /= 10
        count += round * base
        if weight == 1:
            count += n % base + 1
        elif weight > 1:
            count += base
        base *= 10

    return count

if __name__ == '__main__':
    print count(534)