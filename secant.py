import math
def f(x):
    return (math.tan(x)-x)
def sec(x0, x1):
    return ((x0*f(x1)-x1*f(x0))/(f(x1)-f(x0)))
def secant(x0, x1, tol):
    x2 = sec(x0, x1)
    i = 0
    while(abs(x2-x1)>tol):
        t1 = x2
        x2 = sec(x1, x2)
        t2 = x1
        x1 = t1
        x0 = t2
        i = i+1
        print(i, " - ", x2)
    print("The root is ", x2)
x0 = eval(input("Enter first guess"))
x1 = eval(input("Enter second guess"))
tol = eval(input("Enter tolerance"))
secant(x0, x1, tol)
