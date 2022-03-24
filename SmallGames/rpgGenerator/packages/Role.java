package SmallGames.rpgGenerator.packages;

public class Role {
    private String job;

    public Role(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public String randomJob(){
        int roleCheck = (int)(Math.random()*3);

        if(roleCheck == 1) return "Warrior";
        if(roleCheck == 2) return "Thief";
        return "Mage";
    }
}
