for a in range(1,400) :
   for b in range(1,400) :
      c = (1000 - a) - b
      if a < b < c :
         if a**2 + b**2 == c**2 :
            print(a,b,c,end=",")
            print(a*b*c)
