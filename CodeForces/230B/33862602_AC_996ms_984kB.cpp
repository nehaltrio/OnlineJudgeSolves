#include <bits/stdc++.h>
using namespace std;

int main()
{

    int n = 1000000;
    long long int num;

    bool prime[n + 1];
    memset(prime, true, sizeof(prime));

    for (int p = 2; p * p <= n; p++)
    {
        if (prime[p] == true)
        {

            for (int i = p * p; i <= n; i += p)
                prime[i] = false;
        }
    }

    int t;

    cin >> t;

    while (t-- > 0)
    {
        cin >> num;
        long long int square = sqrt(num);
        if (num == 1)
        {
            cout << "NO\n";
        }
        else if (square * square == num && prime[square])
        {
            cout << "YES\n";
        }
        else
        {
            cout << "NO\n";
        }
    }
}