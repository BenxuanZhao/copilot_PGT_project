import matplotlib.pyplot as plt
from wordcloud import WordCloud

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

# 生成词云图
wordcloud = WordCloud(width=800, height=400, background_color='white').generate_from_frequencies(data)

# 显示词云图
plt.figure(figsize=(10, 5))
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis('off')
plt.title("Word Cloud - Common Programming Problems")
plt.show()
