import matplotlib.pyplot as plt
from collections import Counter

data = [-2,-2,1,-2,-2,1,-2,-2,1,2,2,1,-2,-2,-2,1,2,2,-2,-2,2,-2,2,1,3,-2,-2,-2,-2,-2,-2,-2,-2,-2,2,3,1,1,-2,-2,3,-2,-2,-2,-2,-2,-2,-2,-2,2,2,3,3,-2,3,-2,-2,1,-2,2]
names_dict = {1:"regenerated",2:"original",3:"each has its pros and cons"}
filtered_data = [item for item in data if item > 0]
# colors = ['#3ed7ad', '#ff957c', '#59bfff']

counter = Counter(filtered_data)
labels = [f"{names_dict[num]} ({freq})" for num, freq in counter.items()]
frequencies = list(counter.values())

# 绘制饼状图
plt.figure(figsize=(8, 8))
plt.pie(frequencies, labels=labels, autopct='%1.1f%%', startangle=140)
plt.axis('equal')  # 使饼状图呈圆形
plt.title("Pie Chart - Items Greater Than Zero")

# 显示图形
plt.show()