public class Firefox implements Browser {
    protected String url;

    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Firefox url: " + url);
    }

    @Override
    public void refreshPage() {

    }

    @Override
    public void bookmarkPage() {

    }
}