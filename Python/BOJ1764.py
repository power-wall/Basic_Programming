""" 
https://www.acmicpc.net/problem/1764
듣보잡
"""
import sys
input = sys.stdin.readline

N, M = map(int, input().split())

nosee = set()
for _ in range(N):
    line = input().strip()
    nosee.add(line)

nohear = set()
for _ in range(M):
    line = input().strip()
    nohear.add(line)

both = sorted(nohear & nosee)

print(len(both))
for name in both:
    print(name)




