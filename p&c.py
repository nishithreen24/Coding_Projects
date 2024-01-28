def factorial(x):
    if(x>1):
        result = x*factorial(x-1)
    else:
        result = 1
    return result
m = eval(input("Enter number of red balls: "))
n = eval(input("Enter number of blue balls: "))
ways = factorial(m+n)/(factorial(m)*factorial(n))
print("Number of ways ", m, " red and ",n," blue balls can be arranged is ", ways)

