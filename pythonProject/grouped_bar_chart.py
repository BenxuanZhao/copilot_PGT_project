import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

# 示例数据
data = {
    'Similarity': [1,
1,
1,
1,
1,
2,
1,
1,
2,
5,
3,
2,
1,
1,
1,
1,
2,
2,
1,
1,
3,
2,
1,
2,
2,
1,
1,
1,
5,
1,
1,
1,
1,
1,
1,
2,
4,
3,
3,
1,
5,
4,
1,
1,
1,
1,
1,
1,
1,
1,
3,
3,
3,
3,
1,
3,
1,
1,
3,
1,
2,
],
    'Comprehensibility': [-2,
-2,
1,
-2,
-2,
1,
-2,
-2,
1,
2,
2,
1,
-2,
-2,
-2,
1,
2,
2,
-2,
-2,
2,
-2,
2,
1,
3,
-3,
-2,
-2,
-2,
-2,
-2,
-2,
-2,
-2,
-2,
2,
3,
1,
1,
-2,
-2,
3,
-2,
-2,
-2,
-2,
-2,
-2,
-2,
-2,
2,
2,
3,
3,
-2,
3,
-2,
-2,
1,
-2,
2,
],
    'group': [16,
1,
1,
1,
1,
2,
2,
2,
2,
16,
3,
3,
3,
3,
3,
3,
4,
4,
4,
4,
5,
5,
5,
16,
6,
6,
7,
8,
8,
8,
8,
8,
8,
16,
9,
9,
9,
9,
9,
10,
10,
11,
11,
11,
11,
11,
11,
12,
12,
12,
13,
13,
13,
13,
13,
13,
13,
14,
14,
15,
2,
]
}

# 转换为DataFrame
df = pd.DataFrame(data)

# 定义组名
group_names = ["array", "tree", "double_pointer", "dynamic_planning", "fast_pointer", "hash", "heap", "list", "number", "partition", "recursion", "retrospect", "stack_queue", "string", "thread", "other"]
# 定义柱子的颜色和标签
similarity_colors = {1: 'red', 2: 'green', 3: 'blue', 4: 'purple', 5: 'orange'}
similarity_labels = {1: "totally same", 2: "logically same", 3: "basically logically same", 4: "in different logic", 5: "failure"}
comprehensibility_colors = {1: 'pink', 2: 'brown', 3: 'gray'}
comprehensibility_labels = {1: "regenerated", 2: "original", 3: "each has its pros and cons"}

# 按组分组
groups = df.groupby('group')

fig, ax = plt.subplots(figsize=(15, 5))  # 增加图的大小

# 定义柱子的宽度（更细的宽度）
bar_width = 0.3

# 定义组间和组内的间距
group_spacing = 1.2
within_group_spacing = 0.4

# 循环处理每个组
for group_idx, (group_name, group_data) in enumerate(groups):
    # 统计col1的频数（包括所有值）
    col1_counts = group_data['Similarity'].value_counts(sort=False).fillna(0)

    # 统计col2的频数（仅正数）
    col2_counts = group_data['Comprehensibility'][group_data['Comprehensibility'] > 0].value_counts(sort=False).fillna(0)

    # 定义柱子的位置
    x_position = group_idx * group_spacing

    # 画第一根柱子
    bottom = 0
    for value, count in col1_counts.items():
        ax.bar(x_position, count, bar_width, bottom=bottom, color=similarity_colors.get(value), label=similarity_labels.get(value))
        bottom += count

    # 画第二根柱子
    bottom = 0
    for value, count in col2_counts.items():
        ax.bar(x_position + within_group_spacing, count, bar_width, bottom=bottom, color=comprehensibility_colors.get(value), label=comprehensibility_labels.get(value))
        bottom += count

# 创建图例，确保每个条目只出现一次
handles, labels = plt.gca().get_legend_handles_labels()
by_label = dict(zip(labels, handles))

# 分离两个类别的图例
similarity_handles = {k: v for k, v in by_label.items() if k in similarity_labels.values()}
comprehensibility_handles = {k: v for k, v in by_label.items() if k in comprehensibility_labels.values()}

legend1 = plt.legend(handles=similarity_handles.values(), title='Similarity', loc='upper left')
plt.gca().add_artist(legend1)
plt.legend(handles=comprehensibility_handles.values(), title='Comprehensibility', loc='upper right')

plt.xticks(np.arange(len(groups)) * group_spacing + within_group_spacing / 2, [group_names[i-1] for i in groups.groups.keys()], rotation=45, ha='right')
plt.xlabel('Groups')
plt.ylabel('Counts')
plt.title('Bar Chart Grouped By ADS Types')
plt.show()