import math
import cmath
def root(w, n):
    theta = cmath.phase(w)
    r = abs(w)
    for k in range(0, n):
        z = round(math.pow(r, (1/(2*n))), 3)*complex(round(math.cos((theta/n)+(2*k*math.pi/n)), 3), round(math.sin((theta/n)+(2*k*math.pi/n)), 3))
        print("Cartesian Form: ", z)
        print("Polar Form: ", round(math.pow(r, (1/(2*n))), 3),"(cos", round(180*((theta/n)+(2*k*math.pi/n))/math.pi),"+ i sin", round(180*((theta/n)+(2*k*math.pi/n))/math.pi),")")
        # /math.pi),")")
        # print(cmath.polar(z))
print("Equation in the form z^n = u+iv")
N = eval(input("Enter n\n"))
u = eval(input("Enter u\n"))
v = eval(input("Enter v\n"))
W = complex(u, v)
root(W, N)