
public class BinaryCipher implements СipherBehaviour {
    @Override
    public String cipher(String a) {
        char[] str = a.toCharArray();
        StringBuilder answ = new StringBuilder();
        for (int i = 0; i < str.length;i++){
            if (str[i] != ' '){
                answ.append(Integer.toBinaryString(str[i])).append(' ');
            }
        }
        a = answ.toString();
        return a;
    }

    @Override
    public String decod(String a){
        String[] str = a.split(" ");
        StringBuilder answ = new StringBuilder();
        for (int i = 0; i < str.length;i++){
            answ.append((char)Integer.parseInt(str[i], 2)).append(' ');
        }
        a = answ.toString();
        return a;
    }
}
