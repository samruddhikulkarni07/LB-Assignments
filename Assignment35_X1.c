// Consider Singly Linear Linked List to solve below problem statements.
// Search an element

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

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
bool Search(PNODE Head, int No)
{
    bool bFlag = false;

    while(Head != NULL)
    {
        if((Head->data) == No)
        {
            bFlag = true;
        }

        Head = Head->next;
    }

    return bFlag;
    
}


int main()
{
    bool bRet = false;

    struct node* head = NULL;

    InsertLast(&head,11);
    InsertLast(&head,21);
    InsertLast(&head,51);
    InsertLast(&head,101);

    Display(head);

    bRet = Search(head,21);
    if(bRet == true)
    {
        printf("Number is present in Linked List\n");
    }
    else
    {
        printf("Number is not present in Linked List\n");
    }



    return 0;
}