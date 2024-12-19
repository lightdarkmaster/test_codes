num1 = 100;
num2 = 50;

def addTwoNumbers():
    result = num1 + num2
    print('The sum of the two number is : ' + str(result));

def subTwoNumbers():
    result = num1 - num2;
    limit = 100
    print("the difference of the two numbers is : " + str(result));
    if result > 100:
        print('the result of ' + str(result) + 'is greater than ' + str(limit));
    else :
        print('the result of ' + str(result) + ' is less than' + str(limit));    
        
        
    
addTwoNumbers();
subTwoNumbers();