
public class CaesarСipher implements СipherBehaviour {
    @Override
    public String cipher(String a){
        char[] str = a.toCharArray();
        int ascii;
        for (int i = 0; i < str.length;i++){
            if (str[i] != ' '){
                ascii = ((int) str[i])+1;
                str[i] = (char)ascii;
            }
        }
        a = String.valueOf(str);
        return a;
    }

    @Override
    public String decod(String a){
        char[] str = a.toCharArray();
        int ascii;
        for (int i = 0; i < str.length;i++){
            if (str[i] != ' '){
                ascii = ((int) str[i])-1;
                str[i] = (char)ascii;
            }
        }
        a = String.valueOf(str);
        return a;
    }
}
