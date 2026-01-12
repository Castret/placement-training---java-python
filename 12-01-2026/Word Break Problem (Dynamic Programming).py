
def wb(s,w):
    dp=[False]*(len(s)+1)
    dp[0]=True
    for i in range(1,len(s)+1):
        for j in range(i):
            if dp[j] and s[j:i] in w:
                dp[i]=True
    return dp[-1]

print(wb("leetcode",{"leet","code"}))
