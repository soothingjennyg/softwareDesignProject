import java.util.Date;

interface BuildShift{

    public Boolean reset();
    public Boolean populateTimeSlot(Date from, Date to);
    public Shift duplicateShift(int shiftId);
    public Shift getResult();

}
