import re
import sys
import os

fileHandle = open(sys.argv[1])
'''
if "credentials.csv" in fileHandle:
    sys.stderr.write ('Access key ID found \n')
    sys.exit(-1)
'''

allLines = fileHandle.readlines();
#print allLines

for l in allLines:
    m = re.search("(\s|\"|\'|^|\A)AK[A-Z0-9]{18}(\s|\"|\'|$|\z)", l);
    if m:
        print "access : %s" % m;
        print l
        sys.stderr.write ('Access key ID found \n')
        sys.exit(-1)
    p = re.search("(\s|\"|'|^)[a-zA-Z0-9~@#$^*()_+=\/[\]{}|\\,.?:-]{40}(\s|\"|'|$|\z)",l);
    if p:
        print "secret : %s" % p;
        print l;
        sys.stderr.write ('Secret Access key found \n')
        sys.exit(-1)
    r = re.search("(\s|\"|'|^)[a-zA-Z0-9]{64}(\s|\"|'|$|\z)",l);
    if r:
        print "token : %s" % r;
        print l;
        sys.stderr.write ('Digital ocean token \n')
        sys.exit(-1)


'''
import sys
filenames = os.listdir(os.curdir)

for filename in filenames:
    if os.path.isfile(filename) and filename.endswith(".txt"):
        sys.stderr.write ('File exists \n')
        break
else:
    sys.stderr.write ('No database file found. Exiting program. \n')
    sys.exit(-1)
'''