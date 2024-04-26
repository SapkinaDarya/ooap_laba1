
abstract class NewCipher {
    СipherBehaviour cipherBehaviour;

    public NewCipher() {}

    public String cipher(String a){
        return cipherBehaviour.cipher(a);
    }

    public String decod(String a){
        return cipherBehaviour.decod(a);
    }

}
