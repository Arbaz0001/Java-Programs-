public class Video {
    private String title;
    private String date; // For simplicity, we'll use String for date
    private double size;  // Size in MB
    private int duration; // Duration in minutes

    // Constructor to initialize the attributes
    public Video(String title, String date, double size, int duration) {
        this.title = title;
        this.date = date;
        this.size = size;
        this.duration = duration;
    }

    // Getter and Setter methods (optional but useful)
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Method to display video details
    public void displayVideoDetails() {
        System.out.println("Video Title: " + title);
        System.out.println("Date: " + date);
        System.out.println("Size: " + size + " MB");
        System.out.println("Duration: " + duration + " minutes");
    }

    // Main method to test the Video class
    public static void main(String[] args) {
        // Create an instance of Video
        Video myVideo = new Video("Learning Java", "2025-01-05", 500.25, 120);

        // Display the video details
        myVideo.displayVideoDetails();

        // Modify some attributes
        myVideo.setTitle("Advanced Java");
        myVideo.setSize(700.50);
        myVideo.setDuration(150);

        // Display the updated video details
        myVideo.displayVideoDetails();
    }
}
