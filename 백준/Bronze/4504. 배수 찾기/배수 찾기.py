a = int(input())

while(1):
    b=int(input())
    if(b==0):
        break
    if (b%a != 0):
        print("{0} is NOT a multiple of {1}.".format(b,a))
    else:
        print("{0} is a multiple of {1}.".format(b,a))