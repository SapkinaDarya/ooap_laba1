
public class TranspCipher implements СipherBehaviour{
    @Override
    public String cipher(String a) {
        char[] str = a.toCharArray();
        char[][] transp = new char[2][str.length/2+1];
        for (int i = 0; i<2;i++){
            for (int j = 0; j < str.length/2+1; j++){
                transp[i][j] = ' ';
            }
        }
        int index;
        for (int i = 0;i<2;i++){
            for (int j = 0; j<str.length/2+1; j++){
                index = i*(str.length/2+1)+j;
                if (i*(str.length/2+1)+j <= str.length-1){
                    transp[i][j] = str[index];
                }
            }
        }
        StringBuilder answ = new StringBuilder();
        for (int i = 0;i<str.length/2+1;i++){
            for (int j = 0; j<2; j++){
                answ.append(String.valueOf(transp[j][i]));
            }
        }
        a = answ.toString();
        return a;
    }

    @Override
    public String decod(String a){
        char[] str = a.toCharArray();
        char[][] transp = new char[str.length/2][2];
        for (int i = 0; i<str.length/2;i++){
            for (int j = 0; j < 2; j++){
                transp[i][j] = ' ';
            }
        }
        int index;
        for (int i = 0;i<str.length/2;i++){
            for (int j = 0; j<2; j++){
                index = i*2+j;
                if (i*2+j <= str.length-1){
                    transp[i][j] = str[index];
                }
            }
        }
        StringBuilder answ = new StringBuilder();
        for (int i = 0;i<2;i++){
            for (int j = 0; j<str.length/2; j++){
                answ.append(String.valueOf(transp[j][i]));
            }
        }
        a = answ.toString();
        return a;
    }
}
