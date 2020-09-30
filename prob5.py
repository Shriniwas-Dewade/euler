i = 200000000
num = []
count = 0
n = 232792560

while i <= 255555555 :
   for j in range(1,21):
      if i % j == 0 :
         count+=1
      else :
         count = 0
   if count >= 15 :
      print(count)
      num.append(n)
   i+=1

print(min(num))
