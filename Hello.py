#!/usr/bin/python

print "Contents of Java Output are:\n";

f = open('out.txt')
for line in iter(f):
    print line
f.close()
