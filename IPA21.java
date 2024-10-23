import java.util.Scanner;

public class IPA21 {
    
    static int findPointsForGivenSkill(PlayerIPA[] arr, String skill){
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i].getSkill().equalsIgnoreCase(skill)){
                sum += arr[i].getPoints();
            }
        }
        return sum;
    }

    static PlayerIPA getPlayerBasedOnLevel(PlayerIPA[] arr, String level, String skill){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getLevel().equalsIgnoreCase(level) && arr[i].getSkill().equalsIgnoreCase(skill)){
                if(arr[i].getPoints() >= 20){
                    return arr[i];
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerIPA[] arr = new PlayerIPA[4];

        for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
		
			arr[i] = new PlayerIPA(a,b,c,d);
		}

        String skill = sc.nextLine();
        String level = sc.nextLine();

        int sum = findPointsForGivenSkill(arr, skill);
        if(sum > 0) System.out.println(sum);
        else System.out.println("The given Skill is not available");

        PlayerIPA ans = getPlayerBasedOnLevel(arr, level, skill);
        if(ans == null)
            System.out.println("No player is available with specified level, skill and eligibility points");

        else System.out.println(ans.getPlayerId());

        sc.close();

    }
}

class PlayerIPA
{
	private int playerId;
	private String skill;
	private String level;
	private int points;

	public PlayerIPA(int playerId, String skill, String level, int points)
	{
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}	
	
	public int getPlayerId()
	{
		return playerId;
	}
	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}
	public String getSkill()
	{
		return skill;
	}
	public void setSkill(String skill)
	{
		this.skill = skill;
	}
	public String getLevel()
	{
		return level;
	}
	public void setLevel(String level)
	{
		this.level = level;
	}
	public int getPoints()
	{
		return points;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
}
