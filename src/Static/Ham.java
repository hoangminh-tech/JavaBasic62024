package Static;

public class Ham {
    public static void OpenUrl (String url){
        System.out.println(url);
    }
    public static void click (String elementname1){
        System.out.println("Click element: "+elementname1);
    }

    public static void setText(String Text)
    {
        System.out.println("Set Text: "+ Text);
    }

    public static String getElementText(String elementname2){
        System.out.println("Kết quả là: "+ elementname2);
        return elementname2;

    }

    public static void main(String[] args) {
        OpenUrl("https://www.google.com/");
        setText("abc@gmail.com");
        getElementText( "Trường ĐH ABC");
    }
}
