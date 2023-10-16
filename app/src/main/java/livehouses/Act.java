package livehouses;

import java.util.Date;

public class Act {

    private Date begin_time;
    private Date end_time;
    private Band band;

    public Act(Date begin_time, Date end_time, Band band) {
        this.begin_time = begin_time;
        this.end_time = end_time;
        this.band = band;
    }

    static public Date isValiDate(Date begin_time, Date end_time) {
        if (begin_time.after(end_time)) {
            return null;
        }
        return end_time;
    }

    public Date getBeginTime() { return begin_time; }
    public Date getEndTime() { return end_time; }
    public Band getBand() { return band; }
}


