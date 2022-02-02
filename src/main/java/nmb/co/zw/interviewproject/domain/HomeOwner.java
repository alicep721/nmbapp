package nmb.co.zw.interviewproject.domain;

public enum HomeOwner {
    YES("yes"), NO("no");

    private String homeOwner;

    HomeOwner(String homeOwner) {
        this.homeOwner = homeOwner;
    }

    public String getHomeOwner() {
        return homeOwner;
    }
}
