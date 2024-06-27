#include <bits/stdc++.h>
using namespace std;
#define ll long long int
#define Fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
ll mod=1e9+7;
int main()
{	
	ll w,h,cases=0,ans=0,n,x,y;
	char a[60][60],visited[60][60];
	queue<pair<int,int>>q;
	while(1)
	{	cases++;
		ans=0;
		cin>>h>>w;
		if(h==0)
		{
			return 0;
		}
		memset(visited,0,sizeof(visited));
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<w;j++)
			{
				cin>>a[i][j];
				if(a[i][j]=='A')
				{
					q.push(make_pair(i,j));
					visited[i][j]=1;
				}
			}
		}
		while(!q.empty())
		{
			ans++;
			n=q.size();
			for(int i=0;i<n;i++)
			{
				x=q.front().first;
				y=q.front().second;
				//cout<<a[x][y]<<' ';
				q.pop();
				if(x+1<h &&a[x+1][y]=='A'+ans && visited[x+1][y]==0)
				{
					q.push(make_pair(x+1,y));
					visited[x+1][y]=1;
				}
				if(x-1>=0 && a[x-1][y]=='A'+ans && visited[x-1][y]==0)
				{
					q.push(make_pair(x-1,y));
					visited[x-1][y]=1;
				}
				if(y+1<w && a[x][y+1]=='A'+ans&&visited[x][y+1]==0)
				{
					q.push(make_pair(x,y+1));
					visited[x][y+1]=1;
				}
				if(y-1>=0 &&a[x][y-1]=='A'+ans && visited[x][y-1]==0)
				{
					q.push(make_pair(x,y-1));
					visited[x][y-1]=1;
				}
				if(x+1<w && y+1<w &&a[x+1][y+1]=='A'+ans && visited[x+1][y+1]==0)
				{
					q.push(make_pair(x+1,y+1));
					visited[x+1][y+1]=1;
				}
				if(x+1<w && y-1>=0 &&a[x+1][y-1]=='A'+ans && visited[x+1][y-1]==0)
				{
					q.push(make_pair(x+1,y-1));
					visited[x+1][y-1]=1;
				}
				if(x-1>=0 && y+1<w &&a[x-1][y+1]=='A'+ans && visited[x-1][y+1]==0)
				{
					q.push(make_pair(x-1,y+1));
					visited[x-1][y+1]=1;
				}
				if(x-1>=0 && y-1>=0 &&a[x-1][y-1]=='A'+ans && visited[x-1][y-1]==0)
				{
					q.push(make_pair(x-1,y-1));
					visited[x-1][y-1]=1;
				}
			}
			cout<<endl;
		}
		cout<<"Case "<<cases<<": "<<ans<<endl;

	}

}
    