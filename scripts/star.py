num1 = 500;
num2 = 300;

def addTwoNumbers():
    result = num1 + num2;
    print('the sum of the two number is : ' + str(result));
    
def subTwoNumbers():
    diffresult = num1 - num2;
    print('the difference of the two numbers is : ' + str(diffresult));
    if num1 < num2:
        diffresult = num2 -num1;
        print('The Difference of the two numbers is : ' + str(diffresult));
        

addTwoNumbers();
subTwoNumbers();