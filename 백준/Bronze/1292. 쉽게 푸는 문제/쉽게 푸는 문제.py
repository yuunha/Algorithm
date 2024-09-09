lst_1 = [];
lst_2 = [];
for i in range(1,101):
    lst_1.append([i]*i);
for i in lst_1:
    for j in i:
        lst_2.append(j);

a, b = map(int,input().split());
sum = 0;
for i in range(a-1, b):
    sum += lst_2[i];
print(sum)