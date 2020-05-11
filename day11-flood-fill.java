class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)
            return image;
        fill(image,sr,sc,newColor,image[sr][sc],image.length,image[0].length);
        return image;
    }
    public void fill(int[][] image,int sr, int sc,int color,int c,int row,int col)
    {
        if(sr<0||sc<0||sr>=row||sc>=col||image[sr][sc]!=c)
            return;
        image[sr][sc]=color;
            fill(image,sr+1,sc,color,c,row,col);
            fill(image,sr,sc+1,color,c,row,col);
            fill(image,sr-1,sc,color,c,row,col);
            fill(image,sr,sc-1,color,c,row,col);
    }
}
