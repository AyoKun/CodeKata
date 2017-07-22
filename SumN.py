n = int(input("Enter the total number of numbers to be summed : "))
n1 = n
s = 0
i = 1
if(n>0):
  while(n1>0):
    s = s + i
    n1=n1-1
    i=i+1
  print("The sum of ",n," numbers is : ", s)
else:
  print("Invalid input.")
