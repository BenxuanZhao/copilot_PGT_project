import numpy as np
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

string = """
5 5 5 5 5 
5 4 5 4 5 
5 5 4 4 5 
5 5 5 5 5 
5 5 5 4 5 
5 4 4 4 4 
5 5 5 5 5 
5 5 5 5 5 
5 4 4 4 4 
3 3 3 3 3 
5 5 5 5 4 
5 5 5 4 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 4 4 4 
5 5 4 5 4 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
4 4 4 4 4 
5 5 5 5 5 
3 3 3 3 3 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 4 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
4 4 4 4 4 
5 5 4 4 4 
5 5 4 5 4 
5 5 4 5 4 
5 5 5 5 5 
4 4 3 4 3 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 4 4 4 4 
5 4 4 4 4 
4 5 4 5 5 
5 5 5 5 5 
5 5 5 5 5 
5 5 5 4 5 
5 4 5 5 5 
5 5 5 5 5 
5 5 5 5 5 
3 3 3 3 3 
5 5 4 4 5 
"""


# 将多行字符串分割成每行的列表
lines = string.strip().split('\n')

# 将每行的数字字符串分割成整数列表，并构建二维数组
matrix = [list(map(int, line.split())) for line in lines]

# 使用numpy的transpose函数实现行列互换
transposed_matrix = np.transpose(matrix)
print(string)
# print(data_string)
print(transposed_matrix)

# 假设你已经将数据加载到名为 data 的 pandas DataFrame
data = {
    'Grammar Accuracy': list(transposed_matrix[0]),
    'Coherence of Information': list(transposed_matrix[1]),
    'Consistency throughout the Text': list(transposed_matrix[2]),
    'Transitional Devices': list(transposed_matrix[3]),
    'Logical Distribution of Information': list(transposed_matrix[4]),
    'Time Complexity': [2,8,5,5,5,3,3,3,5,5,3,3,3,5,3,5,5,5,3,5,3,2,3,5,3,3,4,3,3,3,3,3,3,4,2,2,5,3,2,3,2,3,3,3,3,3,3,3,7,5,3,3,3,3,1,3,3,3,5,5,3],
    'Space Complexity': [2,8,1,3,5,3,3,3,3,5,1,1,1,1,1,5,5,5,1,5,1,1,1,5,3,3,3,3,3,1,3,1,1,3,1,1,3,1,1,1,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3],
    'Regenerated Code Quality': [1,
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
2
]
}
df = pd.DataFrame(data)
# 计算相关性
corr_matrix = df.corr()

# 绘制相关性热力图
plt.figure(figsize=(12, 10))
sns.heatmap(corr_matrix, annot=True, cmap='coolwarm')
plt.title('Correlation Heatmap')
plt.show()