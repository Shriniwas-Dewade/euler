num = []
i = 999

while i > 99 :
   for n2 in range(99,999) :
      n = i * n2
      org = str(n)
      rev = org[::-1]
      if org == rev :
         num.append(org)
   i = i-1
print(max(num))
