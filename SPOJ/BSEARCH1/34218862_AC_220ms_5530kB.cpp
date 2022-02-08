#include <iostream>
#include <bits/stdc++.h>
using namespace std;

    int binarySearch(int sortedArray[], int key,int n) {
        int index = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                high = mid - 1;
            }
        }
        return index;
    }


int main()
{
     int n,q;
    scanf("%d%d",&n,&q);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for (int i = 0; i < q; i++) 
    {
        int x;
        scanf("%d",&x);
        int pos=binarySearch(arr,x,n);
        if(pos==-1)
        {
            printf("-1\n");
        }
        else
        {
            printf("%d\n",pos);
        }
    }

    return 0;
}

