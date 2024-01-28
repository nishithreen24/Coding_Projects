import math
def f1(x):
    return (x**3 + x**2 - 4*x + 1)
def f1_d(x):
    return (3*(x**2) + 2*x - 4)
def f2(x):
    return (math.cos(x)-x)
def f2_d(x):
    return (-1*math.sin(x)-1)
def f3(x):
    return (math.sin(x)/math.cos(x))
def f3_d(x):
    return (1/((math.cos(x))**2))
def taylor(a):
    return(a-(f1(a)/f1_d(a)))
def newtonraphson(x0, tol):
    x1 = taylor(x0)
    i = 0
    while(abs(x1-x0)>tol):
        temp = x1
        x1 = taylor(x1)
        x0 = temp
        i = i+1
        print((i)," - ", x1)
    print("The root is ", x1)
x0 = eval(input("Enter first guess"))
tol = eval(input("Enter tolerance"))
newtonraphson(x0, tol)
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
x1 = eval(input("Enter second guess"))
secant(x0, x1, tol)