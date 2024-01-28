import random
shape = ["Square", "Rectangle", "Ellipse", "Circle", "Triangle"]
choice = random.randint(0, 4)
if(choice==0):
  print(shape[choice])
  l = random.randrange(1,10)
  print(l)
  area = l*l
  print("Area of ", shape[choice], " = ", area)
elif(choice==1):
  print(shape[choice])
  l = random.randrange(1,10)
  b = random.randrange(1,10)
  print(l)
  print(b)
  area = l * b
  print("Area of ", shape[choice], " = ", area)
elif(choice==2):
  print(shape[choice])
  a = random.randrange(1,10)
  b = random.randrange(1,10)
  print(a)
  print(b)
  area = (22/7)*a*b
  print("Area of ", shape[choice], " = ", area,)
elif(choice==3):
  print(shape[choice])
  r = random.randrange(1,10)
  print(r)
  area = (22/7)*r*r
  print("Area of ", shape[choice], " = ", area)
else:
  print(shape[choice])
  a = random.randrange(1,10)
  print(a)
  b = random.randrange(1,10)
  print(b)
  c = random.randrange(1,10)
  print(c)
  s = (a+b+c)/2
  area = pow(s*(s-a)*(s-b)*(s-c), 1/2)
  print(area)
  print("Area of ", shape[choice], " = ", area)
