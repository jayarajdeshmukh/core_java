package controlStatement.conditionalOrDecisonMaking;

public class Demo8 {
    public static void main(String[] args) {
        String fileType = "xxx";
        if (fileType == "pdf") {
            System.out.println("pdf logic");

        } else if (fileType == "xml") {
            System.out.println("xml logic");
        } else if (fileType == "excel"){
            System.out.println("excel logic");
        } else if (fileType == "json"){
            System.out.println("json logic");
        } else if (fileType == "txt"){
            System.out.println("txt logic");
        } else if (fileType == "word"){
            System.out.println("word logic");
        } else if (fileType == "rtf"){
            System.out.println("rtf logic");
        } else {
            System.out.println("invalid file");
        }
    }
}
