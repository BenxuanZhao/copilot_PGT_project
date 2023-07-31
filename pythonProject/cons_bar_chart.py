import matplotlib.pyplot as plt

data = {
    "Lack of detail/Detail missing": 20,
    "Lack of context": 9,
    "No actual code examples": 8,
    "Too complex for inexperienced programmers": 5,
    "Lack of background information": 3,
    "No explanation provided for the chosen approach": 3,
    "No background information on code design and algorithm selection": 2,
    "A priori knowledge required: Binary search trees": 2,
    "Other (1 occurrence)": 0  # 这里将合并出现1次的项
}

# 合并出现1次的项
other_count = sum(value for key, value in data.items() if value == 1)
data["Other (1 occurrence)"] = other_count

# 删除出现1次的各项
data = {key: value for key, value in data.items() if value > 1}

# 提取问题和频次
problems = list(data.keys())
occurrences = list(data.values())

# 绘制水平条形图
plt.figure(figsize=(10, 6))
plt.barh(problems, occurrences, color='lightblue')
plt.xlabel("Occurrences")
plt.ylabel("Problems")
plt.title("Frequency of Common Programming Problems")
plt.tight_layout()
plt.show()