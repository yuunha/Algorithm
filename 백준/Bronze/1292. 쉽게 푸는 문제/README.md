# [Bronze I] 쉽게 푸는 문제 - 1292 

[문제 링크](https://www.acmicpc.net/problem/1292) 

**성능 요약**

메모리: 31120 KB, 시간: 32 ms

**분류**

구현, 수학

**제출 일자**

2024년 9월 9일 10:29:54

**문제 설명**

<p>동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.</p>

<p>이 문제는 다음과 같다. 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.</p>

<p>하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.</p>

**입력** 

 <p>첫째 줄에 구간의 시작과 끝을 나타내는 정수 A, B(1 ≤ A ≤ B ≤ 1,000)가 주어진다. 즉, 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.</p>


**출력** 

 <p>첫 줄에 구간에 속하는 숫자의 합을 출력한다.</p>

&nbsp;   
&nbsp;   

## 풀이과정

 **방법1** 리스트의 인덱스 1부터 1000까지 하나씩 원소 대입- while문 한번 돌때마다 

```python
a,b= map(int, input().split())

list=[0] * 1000

i=1 #list의 요소=현재 숫자(1->2.->3..)
j=0 #list의 인덱스
count=0
total_count=0

while total_count<1000:
  list[j]=i
  j+=1 #인덱스 증가
  count+=1 #각 숫자는 i번만 list에 대입 후, 다음 숫자로 넘어가야함
  total_count+=1
  if(count==i):
    count=0
    i+=1 #다음 숫자로 넘어가기!

answer=sum(list[a-1:b])
print(answer)
```

**방법2** 각 숫자의 start, end인덱스 구하기(for문)

```python
a_,b_= map(int, input().split())

list_=[]

i=1
start=0 #시작 인덱스
end=1  #끝 인덱스
total_count=0

while total_count<1000:
  for j in range(start,end):   #0,1, i=1 
    list_.append(i)
    total_count+=1
  start+=i                    #start=1/ 3
  i+=1                        #i=2 / 3
  end+=i                      #end=3 /6

answer_=sum(list_[a_-1:b_])
print(answer_)
```

**주의할점**

1. `파이썬 문법`
    - `리스트`는 값을 추가하기 전에, list[0]=1과 같이 대입 불가.
        - 먼저, append로 값을 추가하거나, 리스트 초기화하거나( a=[0,1]), insert로 값을 삽입 후 =⇒  인덱스에 접근(할당) 가능하다.
2. `구간` 도 고려해야함(1≤a<b≤1000)
    - while total_count<1000
        
        ⇒ total_count=1000일때는 while문 내부로 들어가면 안되니까, 999까지임.


