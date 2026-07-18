// Consider Singly Linear Linked List to solve below problem statements.
// count elements less than given number

#include<stdio.h>
#include<stdlib.h>

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

#pragma pack(1)
struct node
{
    int data;
    struct node* next;
};

void InsertLast(PPNODE Head, int iNo)
{
    PNODE temp =  NULL;
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*Head == NULL)
    {
        *Head = newn;
    }
    else
    {
        temp = *Head;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;

    }

    
}

void Display(PNODE Head)
{
    while(Head != NULL)
    {
        printf("| %d | -> ",Head->data);
        Head = Head -> next;
    }

    printf("NULL");
    printf("\n");
}

int CountLess(PNODE Head,int X)
{ 
    int iCount = 0;

    while(Head != NULL)
    {
        if((Head->data) < X)
        {
            iCount++;
        }
        
        Head = Head -> next;
    }

    return iCount;

}

int main()
{
    int iRet = 0;

    struct node* head = NULL;

    InsertLast(&head,11);
    InsertLast(&head,12);
    InsertLast(&head,13);
    InsertLast(&head,12);
    InsertLast(&head,15);
    InsertLast(&head,16);
    InsertLast(&head,17);
    InsertLast(&head,18);
    InsertLast(&head,12);
    InsertLast(&head,20);

    Display(head);
    iRet = CountLess(head,15);
    printf("Number of elements less than 15 are : %d\n",iRet);
    
    
    return 0;
}