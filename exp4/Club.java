class Club {
    static String clubName = "Tech Enthusiasts";
    String memberName;

    Club(String memberName) {
        this.memberName = memberName;
    }

    static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    void displayMember() {
        System.out.println("Member Name: " + memberName + ", Club: " + clubName);
    }

    public static void main(String[] args) {
        Club.displayClubName();
        
        Club member1 = new Club("Amit");
        Club member2 = new Club("Priya");
        Club member3 = new Club("Raj");
        
        member1.displayMember();
        member2.displayMember();
        member3.displayMember();
    }
}