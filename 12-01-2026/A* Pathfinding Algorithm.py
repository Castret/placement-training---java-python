
import heapq
def astar(g,s,e,h):
    o=[(h(s),0,s)]
    v=set()
    while o:
        f,c,u=heapq.heappop(o)
        if u==e: return c
        if u in v: continue
        v.add(u)
        for x,w in g[u]:
            heapq.heappush(o,(c+w+h(x),c+w,x))
