x, y, z = map(int, input().split())
n = max(y - x, z - y)
print(n - 1)