class MyCalendar {

    ArrayList<Booking> bookings;

    public MyCalendar() {
        this.bookings = new ArrayList<>();
    }
    public MyCalendar(int start, int end){
        super();
        bookings.add(new Booking(start,end-1));
    }

    public boolean book(int start, int end) {
        int overlap = 0;
        Booking new_booking = new Booking(start, end-1);
        for(Booking cur_booking : bookings){
            if(cur_booking.overlap(new_booking)){
                overlap ++;
            }
            if(overlap >= 1){
                return false;
            }
        }
        bookings.add(new_booking);
        return true;
    }

    private class Booking{
        int start;
        int end;

        public Booking(int start, int end){
            this.start = start;
            this.end = end;
        }

        public boolean overlap(Booking other){
            return (this.start <= other.start && this.end >= other.start) || (this.start >= other.start && this.start <= other.end) || (this.start <= other.start && this.end >= other.end) || (this.start <= other.start && this.end >= other.end);
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */