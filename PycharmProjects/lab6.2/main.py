import numpy as np
import matplotlib.pyplot as plt

#Task 1
# x = np.arange(1, 1000, 100)
# plt.plot(x, np.log((1./np.e**(np.sin(x) + 1.)) / (5./4. + 1./x**15))/np.log(1.+x**2))
# plt.grid(True)
# plt.show()
# print("Значеня функції при х = 1:")
# print(np.interp(1, x, np.log((1/np.e * np.sin(x) + 1) / (5/4 + 1/x**15))/np.log(1+x**2)))
# print("Значеня функції при х = 100:")
# print(np.interp(100, x, np.log((1/np.e * np.sin(x) + 1) / (5/4 + 1/x**15))/np.log(1+x**2)))
# print("Значеня функції при х = 1000:")
# print(np.interp(1000, x, np.log((1/np.e * np.sin(x) + 1) / (5/4 + 1/x**15))/np.log(1+x**2)))


#Task 2
# x = np.arange(0, 10, 0.1)
# plt.plot(x, x*x - x - 6)
# plt.ylim(-10, 0)
# plt.show()

#Task 3
# x = np.arange(1, 10, 1)
# plt.plot(x, np.log((x**2+1)*np.exp(-np.abs(x)/10))/np.log(1+np.tan(1/(1+np.sin(x)**2))))
# plt.show()

#Task 4

#pie
# sales = np.array([23, 11, 20, 19, 27])
# plt.figure(num=1, figsize=(6,6))
# plt.axes(aspect=1)
# plt.title("Проценти продажів різних груп товарів", size=14)
# plt.pie(sales, labels=["Будівельні товари", "Дитячі іграшки", "Косметика", "Продукти харчування", "Гаджети"])
# plt.show()

#columns
categories = np.array(["Будівельні", "Іграшки", "Косметика", "Харчування", "Гаджети"])
y_pos = np.arange(len(categories))
sales = np.array([230, 110, 200, 190, 270])

plt.bar(y_pos, sales, align="center", alpha=0.5)
plt.xticks(y_pos, categories)
plt.ylabel("Кількість")
plt.title("Абсолютна кількість проданих товарів")
plt.show()