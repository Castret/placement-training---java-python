
import bisect
def lis(a):
    d=[]
    for x in a:
        i=bisect.bisect_left(d,x)
        if i==len(d):
            d.append(x)
        else:
            d[i]=x
    return len(d)

print(lis([10,9,2,5,3,7,101,18]))
