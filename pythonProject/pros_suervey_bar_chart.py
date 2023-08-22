import matplotlib.pyplot as plt

data = {
    "Clarity/Clear": 5+5+5+3+5+2+2+2+5,

    "Logic/Logical": 5+5+5+5+5+4+5,
    "Detail/Detailed": 3 + 2 + 2 + 5,
    "Simplicity/Simple": 2+5,
    "Explanation/Explains": 5,
    "Comprehensive": 2,

}

# 提取词汇和频次
words = list(data.keys())
occurrences = list(data.values())

# 绘制条形图
plt.figure(figsize=(12, 6))
plt.bar(words, occurrences, color='skyblue')
plt.xticks(rotation=45, ha='right')
plt.xlabel("Words")
plt.ylabel("Occurrences")
plt.title("Pros Of Explanations")
plt.tight_layout()
plt.show()