public class btkha1 {
    public static void main(String[] args) {
        String title = "   lập TRÌNH  java  CƠ Bản   ";
        String author = "nguyễn văn a";

        title = title.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");

        title = title.toUpperCase();

        String[] words = author.toLowerCase().split(" ");
        String formatWord = "";

        for(String word : words){
            formatWord += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
        }
        formatWord = formatWord.trim();

        System.out.println("["+title+"] - Tác giả: "+formatWord);
    }
}