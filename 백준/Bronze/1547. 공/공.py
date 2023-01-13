a = [1,2,3]
for n in range(int(input())):
    c,d = map(int, input().split())
    e = a.index(c)
    f = a.index(d)
    a[e], a[f] = a[f], a[e]
print(a[0])