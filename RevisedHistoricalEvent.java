public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription = "";
    private String citation = "";
    
    public RevisedHistoricalEvent()
    {

    }

    public RevisedHistoricalEvent(String description, Date eventDate, String revisedDescription, String citation)
    {

    }
    
    public String teach()
    {
        return "";
    }
    
    @Override
    public String toString()
    {
        String formattedString = "On " + eventDate.toString() + ": " + getDescription();
        return "The following \"history\" was told for many years:\n\n" + formattedString + "By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is the revised history:\n" + revisedDescription;
    }

    @Override
    public boolean equals()
    {
        return true;
    }
}
