import java.util.Scanner;
public class Lab1{
  public static void main(String[] args){
    int N = Integer.parseInt(args[0]);
    int[][] matrix1 = new int[N][N];
    int[][] matrix2 = new int[N][N];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the elements for first array");
    for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
          {
            matrix1[i][j] = scanner.nextInt();
          }
      }
    System.out.println("Enter the elements for second array");
    for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
          {
            matrix2[i][j] = scanner.nextInt();
          }
      }
    int[][] sumMat = new int[N][N];
    for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
          {
           sumMat[i][j] = matrix1[i][j] + matrix2[i][j];
          }
      }
    System.out.println("The first matrix is");
    for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
          {
           System.out.print(matrix1 + "\t");
          }
        System.out.println();
      }
    System.out.println("The second matrix is");
    for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
          {
           System.out.print(matrix2 + "\t");
          }
        System.out.println();
      }
    System.out.println("The sum of the matrix is");
    for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
          {
           System.out.print(sumMat + "\t");
          }
        System.out.println();
      }
  }
}
