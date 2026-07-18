// Consider Singly Linear Linked List to solve below problem statements.
// Return position of first occurance

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

int Count(PNODE Head)
{ 
    int iCount = 0;

    while(Head != NULL)
    {
        iCount++;
        Head = Head -> next;
    }

    return iCount;

}

int FirstOccur(PNODE Head, int No)
{
    int iPos = 0;
    int iCount = 0;
    int i = 0;

    iCount = Count(Head);

    for(i = 1; i <= iCount; i++)
    {
        if(Head->data == No)
        {
            iPos = i;
            break;
        }

        Head = Head->next;

    }

    return iPos;

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
    iRet = Count(head);
    printf("Number of elements are : %d\n",iRet);

    iRet = FirstOccur(head, 12);
    printf("First Occurance of number is : %d\n",iRet);
    
    
    return 0;
}