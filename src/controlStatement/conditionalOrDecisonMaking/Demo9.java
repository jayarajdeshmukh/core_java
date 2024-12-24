package controlStatement.conditionalOrDecisonMaking;

public class Demo9 {
    public static void main(String[] args) {
        String fileType = "xml";
        switch (fileType) {
            case "pdf": System.out.println("pdf logic");break;
            case "xml": System.out.println("xml logic");break;
            case "json": System.out.println("json logic");break;
            case "excel": System.out.println("excel logic");break;
            case "txt": System.out.println("txt logic");break;
            case "word": System.out.println("word logic");break;
            case "rtf": System.out.println("rtf logic");break;
            default: System.out.println("invalid file");break;
        }
    }
}
