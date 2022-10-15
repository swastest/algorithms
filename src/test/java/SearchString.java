import java.util.Objects;

public class SearchString {
    public static void main(String[] args) {
        String text = "qwefgfgfgeegqweqwe";
        String sample = "";

        System.out.println(test("================="+text,sample));
    }

    private static int test(String text, String sample){
        text = text.toLowerCase();
        sample = sample.toLowerCase();
        int result =0;
        if(!Objects.equals(text, "") && !Objects.equals(sample, "")){
            for (int i = 0; i<text.length(); i++){
                int j =0;
                while (j < sample.length() && i + j < text.length() && sample.charAt(j) == text.charAt(j + i)){
                    j++;
                }
                if(j == sample.length()){
                    result +=1;
                }
            }

        } else {
            System.out.println("Введи значения");
        }
        return result;
    }
}
