public class ChessboardWithArray {
    public void chessPattern(){
        String white="WW";
        String black="BB";
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i%2==0){
                    if(j%2==0) System.out.print(white+"|");
                    else System.out.print(black+"|");
                }
                else
                  if(j%2==0)  System.out.print(black+"|");
                 else System.out.print(white+"|");
            }
            System.out.println();
        }
    }
}
