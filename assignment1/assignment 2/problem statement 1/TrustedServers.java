import java.util.*;

public class TrustedServers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();

        long []key=new long[n];
        for (int i=0;i<n;i++){
            key[i]=sc.nextLong();
        }
        List<List<Integer>> adj=new ArrayList<>();
        for (int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<n-1;i++){
            int u=sc.nextInt()-1;
            int v=sc.nextInt()-1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        long []xorFromRoot=new long[n];
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        xorFromRoot[0]=key[0];

        long count=(xorFromRoot[0]>=k)?1:0;

        while(!q.isEmpty()){
            int u=q.poll();
            for(int i:adj.get(u)){
                if(!visited[i]){
                    visited[i]=true;
                    xorFromRoot[i]=xorFromRoot[u]^key[i];
                    if(xorFromRoot[i]>=k){
                        count+=1;
                    }
                    q.add(i);
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}