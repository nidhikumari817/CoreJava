public class StarPattern {
    public void LeftTriangle(int rows){
        for (int i=1;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void RightTriangle(int rows){
        for(int i=0; i<rows; i++){
            for(int j=rows-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void DownwardStar(int rows){
        for (int i=0;i<rows;i++){
            for(int j=rows-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Diamond (int rows){
        for (int i=0;i<rows;i++){
            for(int j=rows-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<rows-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pyramid (int rows){
        for (int i=0;i<rows;i++){
            for(int j=rows-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}