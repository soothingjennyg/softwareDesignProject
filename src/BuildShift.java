import java.util.Date;

interface BuildShift{

    public Boolean reset();
    public Boolean constructShift();
    public Boolean populateTimeSlot(Date start, Date end);
    public Shift duplicateShift(int shiftId);
    public Shift getResult();

}
