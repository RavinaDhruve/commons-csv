import os
import sys
filenames = os.listdir(sys.argv[1])


filename = 'credentials.csv'
if filename in filenames:
    print "YES"
    sys.stderr.write ('File exists \n')
    sys.exit(-1)


'''
for filename in filenames:
    if os.path.isfile(filename) and filename.endswith(".txt"):
        sys.stderr.write ('File exists \n')
        break
else:
    sys.stderr.write ('No database file found. Exiting program. \n')
    sys.exit(-1)
'''