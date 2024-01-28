import math
def func(x):
    return (math.tan(x)-x)
def bisection(a,b):
 
    if (func(a) * func(b) > 0):
        print("You have not assumed right a and b\n")
        return
    else:
        while ((b-a) >= 0.01):
            c = (a+b)/2
            if(func(a)==0):
                c = a
                break
            elif(func(b)==0):
                c = b
                break
            elif (func(c) == 0.0):
                break
            if (func(c)*func(a) < 0):
                b = c
            else:
                a = c
             
        print("The value of root is : ", c)
     
# Driver code
# Initial values assumed
a = 2
b = 6
bisection(a, b)