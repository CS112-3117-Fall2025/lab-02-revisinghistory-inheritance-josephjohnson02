public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription = "";
    private String citation = "";
    
    public RevisedHistoricalEvent()
    {

    }

    public RevisedHistoricalEvent(String description, Date eventDate, String revisedDescription, String citation)
    {
        this.description = description;
        this.eventDate = eventDate;
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    public String getRevisedDescription()
    {
        return this.revisedDescription;
    }

    public String getCitation()
    {
        return this.citation;
    }
    
    public void teach()
    {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString()
    {
        String formattedString = "On " + eventDate.toString() + ": " + getDescription();
        return "The following \"history\" was told for many years:\n\n" + formattedString + "\n\nBy correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is the revised history:\n" + revisedDescription + "\n\nSource: " + citation;
    }

    @Override
    public boolean equals()
    {
        if (this.description.equals(description) && this.eventDate.equals(eventDate)
        && this.revisedDescription.equals(revisedDescription) && this.citation.equals(citation))
        {
            return true;
        }
        return false;
    }
}
