#include <bits/stdc++.h>
using namespace std;

#define ii pair<int, int>
#define f first
#define s second
#define mp make_pair

int n, m;
char grid[1000][1000];
bool vstd[1000][1000];

int pdr[1000][1000];

int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, 1, 0, -1};
string directionStr = "URDL";

bool tillVaild(int x, int y)
{
    return (x >= 0 && x < n && y >= 0 && y < m);
}

int main()
{
    cin >> n >> m;

    queue<ii> q;
    ii start, end;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> grid[i][j];
            if (grid[i][j] == 'A')
            {
                start = mp(i, j);
            }
            else if (grid[i][j] == 'B')
            {
                end = mp(i, j);
            }
        }
    }

    q.push(start);
    vstd[start.f][start.s] = true;

    while (!q.empty())
    {
        ii crnt = q.front();
        q.pop();

        for (int i = 0; i < 4; i++)
        {
            int nx = crnt.f + dx[i];
            int ny = crnt.s + dy[i];

            if (!tillVaild(nx, ny) || grid[nx][ny] == '#' || vstd[nx][ny])
            {
                continue;
            }

            vstd[nx][ny] = true;
            pdr[nx][ny] = i;
            q.push(mp(nx, ny));
        }
    }

    if (vstd[end.f][end.s])
    {
        cout << "YES" << endl;
        vector<int> steps;
        ii crnt = end;

        while (crnt != start)
        {
            int prevDir = pdr[crnt.f][crnt.s];
            steps.push_back(prevDir);
            crnt = mp(crnt.f - dx[prevDir], crnt.s - dy[prevDir]);
        }

        reverse(steps.begin(), steps.end());

        cout << steps.size() << endl;
        for (int step : steps)
        {
            cout << directionStr[step];
        }
        cout << endl;
    }
    else
    {
        cout << "NO" << endl;
    }

    return 0;
}