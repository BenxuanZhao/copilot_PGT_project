import matplotlib.pyplot as plt
from collections import Counter

data = [1,1,1,1,1,2,1,1,2,5,3,2,1,1,1,1,2,2,1,1,3,2,1,2,2,1,1,5,1,1,1,1,1,1,2,4,3,3,1,5,4,1,1,1,1,1,1,1,1,3,3,3,3,1,3,1,1,3,1,2]
names_dict = {1:"totally same",2:"logically same",3:"basically logically same",4:"in different logic",5:"failure"}

colors = ['#59a4ff', '#4ace82', '#ff745c', '#ffbd2a', '#b37feb']

counter = Counter(data)
labels = [f"{names_dict[num]} ({freq})" for num, freq in counter.items()]
frequencies = list(counter.values())

# 绘制饼状图
plt.figure(figsize=(8, 8))
plt.pie(frequencies, labels=labels, autopct='%1.1f%%', startangle=140, colors=colors)
plt.axis('equal')  # 使饼状图呈圆形
plt.title("Pie Chart - Items Greater Than Zero")

# 显示图形
plt.show()