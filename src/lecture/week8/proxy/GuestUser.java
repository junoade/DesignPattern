package lecture.week8.proxy;

class GuestUser implements User{
    @Override
    public void checkOut() {
        System.out.print("Showing Registration Page");
    }
}
