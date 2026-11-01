#include <stdio.h>
#include <stdlib.h>
struct Node{
    int data;
    struct Node*next;

};
struct Node*front = NULL;
struct Node *rear = NULL;
void enqueue(int value){
    struct Node*newNode;
    newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    if(front == NULL){
        front=rear=newNode;
    }
    else{
        rear->next = newNode;
        rear=newNode;
    }
}
void dequeue(){
    if(front == NULL){
        printf("Queue Underflow");
        return;
    }
    struct Node*temp = front;
    printf("%d",temp->data);
    front=front->next;
    free(temp);
    if(front == NULL){
        rear = NULL;
    }
}
void peek(){
     if(front == NULL){
        printf("Queue Underflow");
        return;
    }
    printf("%d",front->data);
}
void display(){
    struct Node *temp = front;
    while(temp!=NULL){
        printf("%d",temp->data);
        temp = temp->next;
    }
}

int main(){
    int choice;
    int value;

    while(1){
        printf("\n===== QUEUE USING LL =====\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");

        printf("Enter Your Choice: ");
        scanf("%d", &choice);

        switch(choice){
            case 1:
                printf("Enter Value: ");
                scanf("%d", &value);
                enqueue(value);
                break;

            case 2:
                dequeue();
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
                printf("Invalid Choice\n");
        }
    }
}
