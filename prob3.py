n = 600851475143
i = 2

while i * i < n:
   while n % i == 0 :
      #print(i,end=" ")
      n/=i
   i+=1

print("max = ",n)
