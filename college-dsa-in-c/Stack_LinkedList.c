#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node*next;
};
struct Node *top = NULL;
void push(int value){
    struct Node*newNode;
    newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = top;
    top = newNode;
}
void pop(){
    if(top == NULL){
        printf("Underflow");
        return;
    }
    struct Node*temp = top;
    printf("the Value Popped is %d",temp->data);
    top=top->next;
    free(temp);
}
void peek(){
    if(top == NULL){
        printf("Empty Stack");
        return;
    }
    printf("The Top Value In The Stack Is %d",top->data);
}
void display(){
    if(top == NULL){
        printf("Stack EMPTY TOP");
        return;
    }
    struct Node*temp = top;
    while(temp!=NULL){
        printf("%d",temp->data);
        temp=temp->next;
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