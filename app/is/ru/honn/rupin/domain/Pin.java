package is.ru.honn.rupin.domain;

public class Pin extends PinObject
{
    protected String link;
    protected String description;
    protected String image;

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    protected int ID;
    protected Board board;

    public Pin()
    {
    }

    public Pin(String link, String description, String image, int ID)
    {
        this.link = link;
        this.description = description;
        this.image = image;
        this.ID = ID;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public Board getBoard()
    {
        return board;
    }

    public void setBoard(Board board)
    {
        this.board = board;
    }
}
