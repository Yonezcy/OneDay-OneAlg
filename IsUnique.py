__author__ = 'zcy'

def isUnique(str):
    '''judge whether the string has the same character

    :param str: input string
    :return: bool
    '''

    a = [0 for i in range(256)]
    for i in range(len(str)):
        v = ord(str[i])
        if a[v]: return False
        a[v] = True

    return True

if __name__ == '__main__':
    print isUnique('hello')