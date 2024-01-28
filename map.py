import matplotlib.pyplot as plt
import numpy as np
def fz(m, c, x):
    return (m*x)+c
def plotz():
    X = np.linspace(-10, 10)
    Y = fz(1, 1, X)
    plt.grid()
    plt.ylim(-2.5, 2.5)
    plt.xlim(-2.5, 2.5)
    plt.plot(X, Y)
    return(X, Y)
def plotw(x, y):
    U = x/((x**2)+(y**2))
    V = (-1*y)/((x**2)+(y**2))
    plt.plot(U, V)
X = np.arange(-10, 10, 0.001)
Y = fz(1, 1, X)
plotz()
plotw(X, Y)