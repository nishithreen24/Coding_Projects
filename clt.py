from numpy import random
import numpy as np
import matplotlib.pyplot as plt
N = eval(input("Enter N: "))
n = np.arange(0, N, 1)
x = random.uniform(0, n, 5)
print(x)
plt.plot(n, x)