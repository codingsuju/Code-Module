import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class CF1614A {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int t;
        t=fs.nextInt();
	    while(t>0){
			int n;
			long l,r,k;
			n=fs.nextInt();
			l=fs.nextLong();
			r=fs.nextLong();
			k=fs.nextLong();
			long[] a=fs.readLongArray(n);
			sortLong(a);
			int ans=0;
			long spent=0;
			for(int i=0;i<n;i++){
				if(a[i]>=l && a[i]<=r){
					if(spent+a[i]<=k){
					   ans++;
          			   spent+=a[i];   
					}
				}
				if(spent>=k){
					break;
				}
			}
			System.out.println(ans);
			t--;
		}
    }
    static final long mod=1_000_000_007;
    static long mul(long a, long b) {
        return a*b%mod;
    }
    static long add(long a, long b) {
        return (a+b)%mod;
    }
    static long fastPow(long base, long e) {
        if (e==0) return 1;
        long half=fastPow(base, e/2);
        if (e%2==0) return mul(half, half);
        return mul(half, mul(half, base));
    }
    static long[] facts, invFacts;
    static void precomp() {
        facts=new long[1_100_000];
        invFacts=new long[1_100_000];
        facts[0]=invFacts[0]=1;
        for (int i=1; i<facts.length; i++) {
            facts[i]=mul(i, facts[i-1]);
        }
        invFacts[invFacts.length-1]=fastPow(facts[facts.length-1], mod-2);
        for (int i=invFacts.length-2; i>=0; i--) {
            invFacts[i]=mul(invFacts[i+1], i+1);
        }
        if (mul(facts[6], invFacts[6])!=1) throw null;
    }
    
    static long nCk(int n, int k) {
        return mul(facts[n], mul(invFacts[k], invFacts[n-k]));
    }
 
    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    static void sortLong(long[] a) {
        ArrayList<Long> l=new ArrayList<>();
        for (long i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long[] readLongArray(int n){
            long[]a =new long[n];
            for(int i=0;i<n;i++){
               a[i]=nextLong();
            }
			return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    } 
    
}