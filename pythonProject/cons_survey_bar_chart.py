import matplotlib.pyplot as plt

data = {
    "Lack of detail/Detail missing": 11,
    "Lack of context": 11,
    "A priori knowledge required": 8,
    "Useless words": 5,
    "No logic": 3,
    "Too complex for inexperienced programmers": 3,
    "Lack of background information": 3,
    "No actual code examples": 1
}

# 提取问题和频次
problems = list(data.keys())
occurrences = list(data.values())

# 绘制水平条形图
plt.figure(figsize=(10, 6))
plt.barh(problems, occurrences, color='lightblue')
plt.xlabel("Occurrences")
plt.ylabel("Problems")
plt.title("Cons Of Explanations")
plt.tight_layout()
plt.show()