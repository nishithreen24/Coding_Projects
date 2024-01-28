import math
u = eval(input("Enter initial velocity of the object(in m/sec): "))
theta = eval(input("Enter the angle of launch(in degrees): "))
theta_rd = (theta*(math.pi))/180
g = 9.80665
h = (u**2*pow(math.sin(theta_rd), 2))/(2*g)
t = (2*u*math.sin(theta_rd))/g
l = (u**2*math.sin(2*theta_rd))/g
print("Maximum height : ", h)
print("Total time to return to ground: ", t)
print("Range of projectile: ", l)