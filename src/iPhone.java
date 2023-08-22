public class iPhone implements MusicPlayer, Phone, InternetBrowser {
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music...");
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    @Override
    public void answerCall() {
        System.out.println("Answering call...");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call...");
    }

    @Override
    public void openWebsite(String url) {
        System.out.println("Opening website: " + url);
    }

    @Override
    public void browseHistory() {
        System.out.println("Browsing history...");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser...");
    }
}
