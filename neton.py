take = input("enter input")
l = len(take)
i = round(l/2)
tell = 1
for x in range (i):
    if (take[x]!=take[l-1-x]):
        tell = 0
        break
if(tell==1):
    print("palindrome")
else:
    print("not a palindrome")