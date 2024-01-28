import numpy as np
import matplotlib.pyplot as plt
gamma = eval(input('Enter the damping coefficient(gamma): '))
omega0 = eval(input('Enter the natural frequency of the system(omega0): '))
q = np.sqrt(((gamma**2)/4)-(omega0**2))
time = np.arange(0, 10, 0.1)
if (gamma>(2*omega0)):
    V0 = 5
    x = (V0/q)*np.exp(gamma*time/(-2))*np.sinh(q*time)
    v = V0*np.exp(gamma*time/(-2))*(np.cosh(q*time)-(gamma/(2*q))*np.sinh(q*time))
    plt.plot(time, x)
    plt.plot(time, v)
    plt.title("Overdamped System")