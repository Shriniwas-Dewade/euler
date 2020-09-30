import math as m
a = range(1,101)
b = range(1,101)

i = 0
sum1 = 0
sum2 = 0
while i <= 99 :
   sum1 += (a[i] * a[i])
   sum2 += a[i]
   i+=1

sum2 = sum2 * sum2
print(sum1)
print(sum2)
print(sum1-sum2)
