import numpy as np
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

string = "4 3 3 4 5 3.8 " \
         "5 4 4 5 5 4.6 " \
         "4 4 4 4 5 4.2 " \
         "5 5 5 5 5 5 " \
         "4 4 4 4 5 4.2 " \
         "5 5 5 5 5 5 " \
         "4 5 5 4 5 4.6 " \
         "5 5 5 5 5 5 " \
         "4 5 4 4 5 4.4 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "4 5 4 4 5 4.4 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 4 5 5 4.8 " \
         "4 5 5 4 4 4.4 " \
         "5 5 5 5 5 5 " \
         "4 5 5 5 4 4.6 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "3 4 3 3 4 3.4 " \
         "4 3 3 3 3 3.2 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 4 4.8 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 4 4.8 " \
         "5 5 5 5 5 5 " \
         "5 5 4 5 5 4.8 " \
         "3 4 3 3 4 3.5 " \
         "4.5 4.5 5 4.5 4 4.5 " \
         "3.5 4.5 5 4 3 4.0 " \
         "4.5 5 5 4.5 4 4.6 " \
         "5 5 5 5 5 5 " \
         "5 5 5 5 5 5 " \
         "4 4 4 4 5 4.2 " \
         "5 5 5 5 5 5 " \
         "5 5 4 5 5 4.8 " \
         "5 5 4 4 5 4.6 " \
         "5 5 5 5 4 4.8 " \
         "5 5 5 5 4 4.8 " \
         "5 5 5 5 5 5 "

data_string = string.split()

# 将分隔后的字符串转换为float类型并整形为二维数组
matrix = np.array([float(i) for i in data_string]).reshape((-1, 6))

# 使用numpy的transpose函数实现行列互换
transposed_matrix = np.transpose(matrix)
# print(string)
# print(data_string)
# print(transposed_matrix)

# 假设你已经将数据加载到名为 data 的 pandas DataFrame
data = {
    'Clarity': list(transposed_matrix[0]),
    'Accuracy': list(transposed_matrix[1]),
    'Completeness': list(transposed_matrix[2]),
    'Practicality': list(transposed_matrix[3]),
    'Simplicity': list(transposed_matrix[4]),
    'Total': list(transposed_matrix[5]),
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