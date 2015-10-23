import re
import sys

allLines = open(sys.argv[1])
print allLines

#with open("aws.js") as file_trial:
#   allLines = file_trial.readlines();
print "working please"

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
