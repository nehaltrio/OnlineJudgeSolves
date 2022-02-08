#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t, n, u, l, r, val, q;

    scanf("%d", &t);
    while (t-- > 0)
    {

        scanf("%d", &n);
        scanf("%d", &u);

        int arr[n] = {0}, diff[n + 1] = {0};

        for (int i = 0; i < n; i++)
        {
            if(i==0){
                diff[i] = arr[i];
            }else{
                diff[i] = arr[i] - arr[i - 1];
            }
        }
        

        for (int i = 0; i < u; i++)
        {
            scanf("%d", &l);
            scanf("%d", &r);
            scanf("%d", &val);

            diff[l] = diff[l] + val;
            diff[r + 1] = diff[r + 1] - val;
        }

        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                arr[i] = diff[i];
            }
            else
            {
                int prefSum = diff[i] + diff[i - 1];
                arr[i] = prefSum;
                diff[i] = prefSum;
            }
        }

        scanf("%d", &q);
        int x;

        for (int i = 0; i < q; i++)
        {
            scanf("%d", &x);
            printf("%d\n", arr[x]);
        }
    }
    return 0;
}
