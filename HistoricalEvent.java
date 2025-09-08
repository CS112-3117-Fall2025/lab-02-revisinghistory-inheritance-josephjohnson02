public class HistoricalEvent {
    protected String description = "";
    protected Date eventDate = new Date();

    public HistoricalEvent() {

    }

    public HistoricalEvent(String description, Date eventDate) {
        this.description = description;
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getDate() {
        return this.eventDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String toString() {
        String formattedString = "On " + eventDate.toString() + ": " + getDescription();
        return formattedString;
    }

    public boolean equals() {
        if (this.description.equals(description) && this.eventDate.equals(eventDate))
        {
            return true;
        }
        return false;
    }
}
