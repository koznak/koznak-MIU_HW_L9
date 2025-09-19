package L9.Prob3;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> back;
    private Stack<String> forward;
    private String currentUrl;

    public BrowserHistory(String homeUrl) {
        back = new Stack<>();
        forward = new Stack<>();
        currentUrl = homeUrl;
    }

    public void visit(String url) {
        if (currentUrl != null) {
            back.push(currentUrl);
        }
        currentUrl = url;
        forward.clear(); 
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (back.isEmpty()) {
            System.out.println("No history to go back to");
        } else {
            forward.push(currentUrl);
            currentUrl = back.pop();
            System.out.println("Back to: " + currentUrl);
        }
    }

    public void forward() {
        if (forward.isEmpty()) {
            System.out.println("No forward history.");
        } else {
            back.push(currentUrl);
            currentUrl = forward.pop();
            System.out.println("Forward to: " + currentUrl);
        }
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.html");// Start with home.html
        browser.visit("page1.html");
        browser.visit("page2.html");
        browser.back();
        browser.back();
        browser.back();
        browser.forward();
        browser.forward();
        browser.forward();
        browser.visit("page3.html");
    }
}
