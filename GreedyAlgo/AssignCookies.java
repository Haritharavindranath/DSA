import java.util.*;
class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=0;
        int i=0;
        int j=0;
        while(i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                n++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return n;
    }
}