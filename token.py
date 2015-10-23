import re
import sys

fileHandle = open(sys.argv[1])
allLines = fileHandle.readlines();
#print allLines

for l in allLines:
    m = re.search("(\s|\"|\'|^|\A)AK[A-Z0-9]{18}(\s|\"|\'|$|\z)", l);
    if m:
        print "access : %s" % m;
        print l
        #True
    p = re.search("(\s|\"|'|^)[a-zA-Z0-9~@#$^*()_+=\/[\]{}|\\,.?:-]{40}(\s|\"|'|$|\z)",l);
    if p:
        print "secret : %s" % p;
        print l;
