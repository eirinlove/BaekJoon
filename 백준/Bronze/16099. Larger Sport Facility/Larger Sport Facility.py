su = int(input())
for x in range (su):
    a, b, c, d = map(int, input().split())
    if a * b < c * d :
        print("Eurecom")
    elif c * d < a * b :
        print("TelecomParisTech")
    else :
        print("Tie")