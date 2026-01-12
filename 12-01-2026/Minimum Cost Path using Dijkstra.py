
import heapq
def dijkstra(g,s):
    d={v:1e9 for v in g}
    d[s]=0
    h=[(0,s)]
    while h:
        c,u=heapq.heappop(h)
        for v,w in g[u]:
            if d[v]>c+w:
                d[v]=c+w
                heapq.heappush(h,(d[v],v))
    return d

g={'A':[('B',1),('C',4)],'B':[('C',2),('D',5)],'C':[('D',1)],'D':[]}
print(dijkstra(g,'A'))
