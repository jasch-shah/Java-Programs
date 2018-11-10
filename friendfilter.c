#include <stdio.h>
#include <stdlib.h>

typedef struct Person
{
     int age;
     struct Person *friend;
} Person;
int n;
int findAbove20(Person *head);

int main(){
  int  i;
  scanf("%d", &n);
  struct Person* head = (struct Person*)malloc(sizeof(struct Person));
  struct Person* current = head;
  int temp;
  scanf("%d", &temp);
  current->age = temp;

  for(i = 1; i < n; i++){
    current -> friend = (struct Person*)malloc(sizeof(struct Person));
    current = current -> friend;
    scanf("%d", &temp);
    current -> age = temp;
    current -> friend = NULL;
  }
  printf("%d\n",findAbove20(head));
}


int findAbove20(Person *head)
{
  int count=0;
  struct Person* node = head;
   //printf("%d",head->age);

          
      while(node!=NULL)
      {
          
          if(node->age>20)
          {
              count++;
          }
          node=node->friend;
      }
     
 return count;
}
