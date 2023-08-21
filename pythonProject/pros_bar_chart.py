import matplotlib.pyplot as plt

data = {
    "Clarity/Clear": 36,
    "Detail/Detailed": 21,
    "Logic/Logical": 21,
    "Concise/Conciseness": 14,
    "Simplicity/Simple": 13,
    "Step-by-step/Sequential": 12,
    "Comprehensive": 6,
    "Explanation/Explains": 5,
    "Structure/Structured": 4,
    "Novel/Novelty": 2,
    "Accuracy/Accurate": 2,
    "Explicit/Explicitly": 2,
    "Validity/Valid": 2,
    "Thorough/Thoroughly": 2,
    "Mathematical/Mathematics": 1,
    "Emphasis/Emphasizes": 1
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