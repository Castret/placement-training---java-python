
from collections import OrderedDict
class LRU:
    def __init__(self,c):
        self.c=c
        self.d=OrderedDict()
    def get(self,k):
        if k not in self.d: return -1
        self.d.move_to_end(k)
        return self.d[k]
    def put(self,k,v):
        if k in self.d:
            self.d.move_to_end(k)
        self.d[k]=v
        if len(self.d)>self.c:
            self.d.popitem(False)
