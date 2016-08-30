package eeandrew.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by andrew on 16/8/30.
 */
public class Crime {
    private UUID id;
    private String title;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    private boolean solved;
    public Crime() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
