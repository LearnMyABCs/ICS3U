package day1;

public class Browser {
    private String browserName;
    private Website[] tabs;
    private int ti;  //points at the next available position in tabs

    public Browser(){
        browserName = "Google Chrome";
        tabs = new Website[10];
        ti=0;
    }

    //accessors
    public String getBrowserName(){
        return browserName;
    }

    public void printAllTabs(){
        for (int i =0; i < tabs.length; i++){
            //website object;
            if (tabs[i] != null){
            System.out.println(tabs[i].getName());
        }
    }

}

    //mutator

    public void openTab(String name, String url){
        Website newTab = new Website (name, url, true);
        tabs[ti] = newTab;
        ti = ti + 1;
    }


}