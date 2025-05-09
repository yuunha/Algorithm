class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n]; //방문 여부
        int count = 0;
        
        for (int i=0;i<n;i++){ 
            if (!visited[i]){//방문하지 않은 경우
                dfs(computers,i,visited,n);
                count++;
            }
        }
        
        return count;
    }
    public void dfs(int[][] graph, int index, boolean[] visited, int n){
        //현재 노드 방문 처리
        visited[index]=true;
    
        //연결된 노드 모두 방문
        for(int x=0;x<n;x++){
            if(graph[index][x] ==1 && visited[x] == false){
                // 연결된 노드 + 방문하지 않은 노드일경우
                visited[x]=true;//방문 처리
                dfs(graph,x,visited,n); //더 깊게 탐색
            }
        }
    }
}

