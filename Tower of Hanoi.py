# Hanoi
# python version

def hanoi(n, a, b, c):
	if n == 1:
		print(a, '-->', c)
	else:
		# move the first n-1 disks from a to b
		hanoi(n-1, a, c, b)
		# move the last one from a to c
		hanoi(1, a, b, c)
		# move the first n-1 disks from b to c
		hanoi(n-1, b, a, c)

hanoi(5, 'A', 'B', 'C')