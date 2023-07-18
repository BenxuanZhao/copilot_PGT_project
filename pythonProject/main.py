import numpy as np
import matplotlib.pyplot as plt

running_times = [61, 73, 66, 66, 71, 66, 68, 63, 63, 76, 60, 64, 68, 65, 66, 62, 66, 61, 66, 65, 101, 89, 68, 70, 61,
                 71, 86, 132, 63, 66, 60, 62, 90, 102, 62, 61, 72, 62, 66, 72]

running_times_re = [64, 65, 68, 69, 64, 71, 66, 78, 71, 65, 72, 75, 73, 74, 66, 68, 60, 109, 60, 111, 95, 66, 123, 106,
                    69, 64, 88, 110, 98, 100, 121, 99, 77, 107, 64, 73, 68, 92, 80, 63]

print(len(running_times))
print(len(running_times_re))

print(np.mean(running_times))
print(np.mean(running_times_re))

print(np.min(running_times))
print(np.min(running_times_re))

print(np.max(running_times))
print(np.max(running_times_re))

print(np.median(running_times))
print(np.median(running_times_re))

print(np.var(running_times))
print(np.var(running_times_re))


# 创建x轴的数据
x = range(len(running_times))

# 创建x轴的数据，使用相同的两个固定坐标值
x = [0, 1]

plt.figure(figsize=(6, 12))

# 统计数据
mean_running_times = np.mean(running_times)
mean_running_times_re = np.mean(running_times_re)
median_running_times = np.median(running_times)
median_running_times_re = np.median(running_times_re)
std_running_times = np.std(running_times)
std_running_times_re = np.std(running_times_re)

# 绘制散点图
plt.scatter([0.33] * len(running_times), running_times, label='running_times')
plt.scatter([0.67] * len(running_times_re), running_times_re, label='running_times_re')

# 绘制散点图和误差棒
plt.errorbar(0.2, mean_running_times, yerr=std_running_times, color='r', fmt='o', markersize=5, capsize=5)
plt.errorbar(0.8, mean_running_times_re, yerr=std_running_times_re, color='g', fmt='o', markersize=5, capsize=5)
# plt.vlines(0.2, mean_running_times - std_running_times, mean_running_times + std_running_times,
#            color='r', linestyle='--', linewidth=2)
# plt.vlines(0.8, mean_running_times_re - std_running_times_re, mean_running_times_re + std_running_times_re,
#            color='g', linestyle='--', linewidth=2)

# 添加图例
plt.legend()

# 设置x轴和y轴标签
plt.xlabel('code')
plt.ylabel('time')

# 设置x轴刻度标签
plt.xticks(x, ['original code', 'regenerated code'])


# 在图中标记平均值和中位数
plt.scatter(0.2, mean_running_times, color='r', marker='s', s=100, label='Mean (running_times)')
plt.scatter(0.8, mean_running_times_re, color='g', marker='s', s=100, label='Mean (running_times_re)')
plt.scatter(0.2, median_running_times, color='b', marker='^', s=100, label='Median (running_times)')
plt.scatter(0.8, median_running_times_re, color='m', marker='^', s=100, label='Median (running_times_re)')

# 添加标记点的文本标签
plt.text(0.2, mean_running_times, 'mean:'+f'{mean_running_times:.2f}', ha='center', va='top')
plt.text(0.8, mean_running_times_re, 'mean:'+f'{mean_running_times_re:.2f}', ha='center', va='top')
plt.text(0.2, median_running_times, 'median:'+f'{median_running_times}', ha='center', va='top')
plt.text(0.8, median_running_times_re, 'median:'+f'{median_running_times_re}', ha='center', va='top')

# 显示图形
plt.show()

