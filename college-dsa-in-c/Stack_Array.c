#include <stdio.h>
#define MAX 10
int stack[MAX];
int top = -1;
void push(int value){
    if(top == MAX - 1){
        printf("Overflow");
        return;
    }
    top = top + 1;
    stack[top] = value;
}
void pop(){
    if(top == -1){
        printf("Underflow");
        return;
    }
    
    printf("The Popped Value is %d" ,stack[top]);
    top--;
}
void peek(){
    if(top==-1){
        printf("Underflow");
        return;

    }
    printf("The Top Value Is %d" ,stack[top]);
}
int size(){
    return top+1;
}
void display(){
    if(top==-1){
        printf("Stack Empty");
        return;
    }
    for(int i = top ; i >= 0 ; i--){
        printf("%d\n",stack[i]);
    }
}
int main(){
    int choice;
    int value;
    while(1){
        printf("=====STACK======");
        printf("1.push");
        printf("2.Pop");
        printf("3.Peek");
        printf("4.Size");
        printf("5.display");
        printf("6.exit");
        printf("Enter Your Choice :- ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
            printf("Enter Value :- ");
            scanf("%d",&value);
            push(value);
            break;
            case 2:
            pop();
            break;
            case 3:
            peek();
            break;
            case 4:
            printf("%d",size());
            break;
            case 5:
            display();
            break;
            case 6:
            return 0;
            default:
            printf("Invalid");


        }

    }
}