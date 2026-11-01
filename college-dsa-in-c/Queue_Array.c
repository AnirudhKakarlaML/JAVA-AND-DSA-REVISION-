#include <stdio.h>
#include <stdlib.h>
#define MAX 10
int queue[MAX];
int front=-1;
int rear = -1;
void enque(int value){
    if(rear == MAX-1){
        printf("Queue Overflow");
        return;
    }
    if(front==-1){
        front=0;
    }
    rear++;
    queue[rear]=value;

}
void deque(){
    if(front==-1){
        printf("Underflow");
        return;
    }
    printf("%d",queue[front]);
    front++;
    if(front>rear){
        front=-1;
        rear=-1;
    }
}
void peek(){
    if(front==-1){
        printf("Underflow");
        return;
    }
    printf("%d",queue[front]);

}
void display(){
    if(front==-1){
        printf("Underflow");
        return;
    }
    for(int i=front;i<=rear;i++){
        printf("%d",queue[i]);
    }

}
int main(){
    int choice;
    int value;
    while(1){
        printf("====Queue====");
        printf("1.Enqueue");
        printf("2.Dequeue");
        printf("3.Peek");
        printf("4.Display");
        printf("Enter Choice :- ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
            scanf("%d",&value);
            enque(value);
            break;
            case 2:
            deque();
            break;
            case 3:
            peek();
            break;
            case 4:
            display();
            break;
            case 5:
            return 0;
            default:
            printf("Invalid Choice");

        }

    }
}