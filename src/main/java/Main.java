public class Main {
    public static void main(String[] args) {
        
        Browser chrome = new Chrome();
        chrome.goToPage("google.com");

        Browser firefox = new Firefox();
        firefox.goToPage("google.pl");
    }
}
