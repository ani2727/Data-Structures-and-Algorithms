//Problem Link: https://bit.ly/3v0if0m 

class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int i = 0;
        int j = M - 1;
        while(i < N && j >= 0)
        {
            if(mat[i][j] == X) return 1;
            else if(mat[i][j] > X) j --;
            else if(mat[i][j] < X) i ++;
        }
        return 0;
    }
}
