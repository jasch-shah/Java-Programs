#include <stdio.h>
#include<string.h>

int main()
{

  
  int n;
  scanf("%d",&n);
 
  for(int m=0;m<n;m++)
 { 
     int a[200],b[200];
  int temp;
  int ans[400]={0};
  int ans2[400];
  char str1[201],str2[201];
  scanf("%s",str1);
  scanf("%s",str2);
  int l1=strlen(str1);
  int l2=strlen(str2);
 
  
  for(int i=l1-1,j=0;i>=0;i--,j++)
  {
      a[j]=str1[i]-'0';
  }
  for(int i=l2-1,j=0;i>=0;i--,j++)
  {
      b[j]=str2[i]-'0';
  }
  if(a[0]==0--b[0]==0)
  {
   printf("0");
    
  }
  
  for(int i=0;i<l2;i++)
    {
        for(int j=0;j<l1;j++)
        {
            ans[i+j]+=b[i]*a[j];
        }
    }
    
    for(int i=0;i<l1+l2;i++)
    {
        temp=ans[i]/10;
        ans[i]=ans[i]%10;
        ans[i+1]=ans[i+1]+temp;
        
    }
    int k=0;
    for( k= l1+l2; k>= 0;k--)
    {
        if(ans[k] > 0)
            break;
    }
  
    for(int i=0;k >= 0;k--,i++)
    {
        ans2[i]=ans[k];
        printf("%d",ans[i]);
    }
    
    printf("\n");
    
    
    
    
}
 
}