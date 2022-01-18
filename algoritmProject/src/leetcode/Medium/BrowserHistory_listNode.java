class BrowserHistory {

    HistoryNode curr;
    HistoryNode last;

    public static class HistoryNode {
        HistoryNode left;
        HistoryNode right;
        String url;
        public HistoryNode(String homepage) {
            this.url = homepage;
        }
    }
    public BrowserHistory(String homepage) {
        last = new HistoryNode(homepage);
        curr = last;
    }
    
    public void visit(String url) {
        HistoryNode vs = new HistoryNode(url);
        curr.right = vs;
        vs.left = curr;
        curr = vs;
    }
    
    public String back(int steps) {
        while(curr.left != null && steps > 0) {
            steps --;
            curr = curr.left;
        }
        
        return curr.url;
    }
    
    public String forward(int steps) {
        while(curr.right != null && steps > 0) {
            steps --;
            curr = curr.right;
        }
        
        return curr.url;
    }

    public static void main(String args[]) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.back(1));                   // You are in "facebook.com", move back to "google.com" return "google.com"
        System.out.println(browserHistory.forward(1));                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        System.out.println(browserHistory.forward(2));                // You are in "linkedin.com", you cannot move forward any steps.
        System.out.println(browserHistory.back(2));                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        System.out.println(browserHistory.back(7));                   // You are in "google.com", you can move 
    }
}
