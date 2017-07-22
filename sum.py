n = int(input("Enter the total number of natural numbers : "))
n1 = n
s = 0
i = 1
while(n1>0):
  s = s + i
  n1=n1-1
  i=i+1
print("The sum of ",n1," is : ", s)
