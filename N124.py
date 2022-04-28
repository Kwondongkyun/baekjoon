f=lambda n:n-1if n<3 else 1+min(f(n//2)+n%2,f(n//3)+n%3)
print(f(int(input())))