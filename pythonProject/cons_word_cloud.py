import matplotlib.pyplot as plt
from wordcloud import WordCloud

data = {
        "Lack of detail/Detail missing": 20,
"Lack of context": 9,
"No actual code examples": 8,
"Too complex for inexperienced programmers": 5,
"Lack of background information": 3 ,
"No explanation provided for the chosen approach": 3 ,
"No background information on code design and algorithm selection": 2 ,
    "A priori knowledge required":6,
    "Exact workings of certain concepts not explained":2,
"Difficulty for beginners and requirement of programming skills": 1 ,
"In-depth explanation missing":3,
    "Chinese language barrier":1,
    "More specific details of code implementations needed":1,
    "Lack of explanation for handling complex data structures": 1,
    "Lack of detail on the purpose and setup of variables": 1,
    "More detailed explanation needed for specific steps and calculations":5,
"Lack of explanation for errors and special cases": 1,
"Overly concise explanation without detailed examples": 1 ,
"Vague explanation of finding the right position in merging a chain table": 1 ,
"Need for more detailed explanations on partially sorted and rotated arrays": 1 ,
    "Need for more detailed explanations on certain topics":3,
"Need for further explanation on overall solution and code functionality": 1 ,
    "Lack of code examples, context, and expertise in explaining the code": 1
}

# 生成词云图
wordcloud = WordCloud(width=800, height=400, background_color='white').generate_from_frequencies(data)

# 显示词云图
plt.figure(figsize=(10, 5))
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis('off')
plt.title("Word Cloud - Cons Of Explanations")
plt.show()
