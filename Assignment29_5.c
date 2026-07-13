//Accept Division of student from user and depends on the ddivision display exam timing.
//There are 4 divisions in school as A,B,C,D.
// Exam of division A at 7 AM, B at 8:30 AM,  C at 9:20 AM and D at 10:30 AM.
// Applicationshould be case insensitive 

#include<stdio.h>

void DisplaySchedule(char chDiv)
{
    if(chDiv == 'A' || chDiv == 'a')
    {
        printf("Your Exam at 7 AM");

    }
    else if(chDiv == 'B' || chDiv == 'b')
    {
        printf("Your Exam at 8:30 AM");
        
    }
    else if(chDiv == 'C' || chDiv == 'c')
    {
        printf("Your Exam at 9:20 AM");
        
    }
    else if(chDiv == 'D' || chDiv == 'd')
    {
        printf("Your Exam at 10:30 AM");
        
    }
    else
    {
        printf("You have entered wrong division");
    }

}

int main()
{
    char cValue = '\0';

    printf("Enter the Division : ");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);
    
    return 0;

}