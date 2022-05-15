package lecture.week8.proxy;

class AuthorizedUser implements User{
    @Override
    public void checkOut() {
        System.out.println("checking out...");
    }
}
