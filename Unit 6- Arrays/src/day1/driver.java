package day1;

public class driver {
    public static void main(String[] args) {
        Website Google = new Website ("Google", "www.google.ca", true);
        Website Youtube = new Website ("Youtube", "www.youtube.ca", true);

        Youtube.setUrl("yootube.com");
        Google.toggleStatus();

        Browser chrome = new Browser();
        chrome.openTab("Google", "google.ca");
        chrome.openTab("Youtube", "youtube.com");
        chrome.openTab("Kahoot", "kahoot.com");
        chrome.printAllTabs();


        
    }
}
